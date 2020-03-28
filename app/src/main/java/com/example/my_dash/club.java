package com.example.my_dash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class club extends AppCompatActivity {
    TextView deparmental, technical, cultural;
    ViewPager viewPager;
    PagerController pagerC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        deparmental = (TextView) findViewById(R.id.dep);
        technical = (TextView) findViewById(R.id.tech);
        cultural = (TextView) findViewById(R.id.cul);
        viewPager = (ViewPager) findViewById(R.id.fragment_container);
        pagerC = new PagerController(getSupportFragmentManager());
        viewPager.setAdapter(pagerC);
        deparmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void onChangeTab(int position) {
        if(position==0){
            deparmental.setTextSize(25);
            deparmental.setTextColor(Color.RED);
            technical.setTextSize(20);
            technical.setTextColor(Color.BLUE);
            cultural.setTextSize(20);
            cultural.setTextColor(Color.BLUE);
        }
        if(position==1){
            deparmental.setTextSize(20);
            deparmental.setTextColor(Color.BLUE);
            technical.setTextSize(25);
            technical.setTextColor(Color.RED);
            cultural.setTextSize(20);
            cultural.setTextColor(Color.BLUE);
        }
        if(position==2){
            deparmental.setTextSize(20);
            deparmental.setTextColor(Color.BLUE);
            technical.setTextSize(20);
            technical.setTextColor(Color.BLUE);
            cultural.setTextSize(25);
            cultural.setTextColor(Color.RED);
        }
    }
}