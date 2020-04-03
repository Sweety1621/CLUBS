package com.example.my_dash.activities;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import com.example.my_dash.R;

import java.util.ArrayList;

import com.example.my_dash.adapters.ItemCardViewAdapter;
import com.example.my_dash.adapters.ItemGridAdapter;
import com.example.my_dash.adapters.ItemListAdapter;
import com.example.my_dash.models.DClubs;
import com.example.my_dash.models.DepClubs;

public class Departmental extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<DClubs> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;

    View view;
    Toolbar toolbar;


    public Departmental() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.departmental, container, false);
        setHasOptionsMenu(true);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) getView().findViewById(R.id.text);
        toolbar = getView().findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Aise");

        recyclerView = getView().findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.design_default_color_primary)));
        list = new ArrayList<>();
        list.addAll(DepClubs.getListData());

        if (savedInstanceState == null) {
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("List Mode");
            list.addAll(DepClubs.getListData());
            showRecyclerViewList();
            mode = R.id.action_list;
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<DClubs> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    // menu


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        toolbar.inflateMenu(R.menu.item_menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId) {
            case R.id.action_list:
                title = "List Mode";
                showRecyclerViewList();
                break;
            case R.id.action_grid:
                title = "Grid Mode";
                showRecyclerViewGrid();
                break;
            case R.id.action_cardview:
                title = "CardView Mode";
                showRecyclerCardView();
                break;
        }
        mode = itemId;
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
    }


//
//

//

//
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, "");
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }

    private void showRecyclerViewList () {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ItemListAdapter listAdapter = new ItemListAdapter(getActivity());
        listAdapter.setListDClubs(list);
        recyclerView.setAdapter(listAdapter);
    }
        private void showRecyclerViewGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        ItemGridAdapter gridAdapter = new ItemGridAdapter(getActivity());
        gridAdapter.setListDClubs(list);
        recyclerView.setAdapter(gridAdapter);
    }
        private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(getActivity());
        cardViewAdapter.setListDClubs(list);
        recyclerView.setAdapter(cardViewAdapter);
    }
}
