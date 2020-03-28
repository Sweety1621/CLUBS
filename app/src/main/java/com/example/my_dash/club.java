package com.example.my_dash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class club extends AppCompatActivity {

    Toolbar mtb;
    TabLayout mtl;
    TabItem mdep;
    TabItem mtech;
    TabItem mcul;
    ViewPager mpager;
    PagerController mpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        mtb=findViewById(R.id.tb);
        setSupportActionBar(mtb);
        getSupportActionBar().setTitle("CLUBS");


        mtl=findViewById(R.id.clubTab);
        mdep=findViewById(R.id.dep);
        mtech=findViewById(R.id.tech);
        mcul=findViewById(R.id.cul);
        mpager=findViewById(R.id.viewp);
        mpc=new PagerController(getSupportFragmentManager(),mtl.getTabCount());
        mpager.setAdapter(mpc);

        mpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mtl));
    }
}
