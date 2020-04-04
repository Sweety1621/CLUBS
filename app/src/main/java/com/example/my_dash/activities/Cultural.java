package com.example.my_dash.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_dash.R;
import com.example.my_dash.adapters.ItemCardViewAdapter;
import com.example.my_dash.adapters.ItemCardViewAdapter2;
import com.example.my_dash.models.CClubs;
import com.example.my_dash.models.CulClubs;
import com.example.my_dash.models.DClubs;
import com.example.my_dash.models.DepClubs;

import java.util.ArrayList;

public class Cultural extends Fragment {
    private RecyclerView recyclerView2;
    private ArrayList<CClubs> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;
    Toolbar toolbar2;

    View view;
    public Cultural()  {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.cultural,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) getView().findViewById(R.id.text);
        toolbar2 = getView().findViewById(R.id.toolbar2);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar2);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Back");

        recyclerView2 = getView().findViewById(R.id.recycler_view2);
        recyclerView2.setHasFixedSize(true);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.design_default_color_primary)));
        list = new ArrayList<>();
        list.addAll(CulClubs.getListData());
        showRecyclerCardView();


    }

    // menu




    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, "");
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }


    private void showRecyclerCardView() {
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        ItemCardViewAdapter2 cardViewAdapter = new ItemCardViewAdapter2(getActivity());
        cardViewAdapter.setListCClubs(list);
        recyclerView2.setAdapter(cardViewAdapter);
    }
}
