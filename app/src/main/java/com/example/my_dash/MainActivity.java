package com.example.my_dash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView sch,not,sm,cal,pro,bf,club,help,website,au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sch=(CardView) findViewById(R.id.sch);
        not=(CardView) findViewById(R.id.not);
        sm=(CardView) findViewById(R.id.sm);
        cal=(CardView) findViewById(R.id.cal);
        pro=(CardView) findViewById(R.id.pro);
        bf=(CardView) findViewById(R.id.bf);
        club=(CardView) findViewById(R.id.club);
        help=(CardView) findViewById(R.id.help);
        website=(CardView) findViewById(R.id.website);
        au=(CardView) findViewById(R.id.au);

        sch.setOnClickListener(this);
        not.setOnClickListener(this);
        sm.setOnClickListener(this);
        cal.setOnClickListener(this);
        pro.setOnClickListener(this);
        bf.setOnClickListener(this);
        club.setOnClickListener(this);
        help.setOnClickListener(this);
        website.setOnClickListener(this);
        au.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.sch: i=new Intent(this,sch.class);startActivity(i); break;
            case R.id.not: i=new Intent(this,not.class);startActivity(i); break;
            case R.id.sm: i=new Intent(this,sm.class);startActivity(i); break;
            case R.id.cal: i=new Intent(this,cal.class);startActivity(i); break;
            case R.id.pro: i=new Intent(this,pro.class);startActivity(i); break;
            case R.id.bf: i=new Intent(this,bf.class);startActivity(i); break;
            case R.id.club: i=new Intent(this,club.class);startActivity(i);break;
            case R.id.help: i=new Intent(this,help.class);startActivity(i); break;
            case R.id.website: i=new Intent(this,website.class);startActivity(i); break;
            case R.id.au: i=new Intent(this,au.class);startActivity(i); break;
            default:break;
        }
    }}
