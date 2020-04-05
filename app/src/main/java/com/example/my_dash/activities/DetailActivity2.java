package com.example.my_dash.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my_dash.R;
import com.example.my_dash.models.CClubs;
import com.example.my_dash.models.TClubs;

public class DetailActivity2 extends AppCompatActivity {
    public static final String EXTRA_CCLUBS = "extra_cclubs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        ImageView imageView = findViewById(R.id.img_detail2);
        TextView name = findViewById(R.id.tv_name_detail2);
        TextView description = findViewById(R.id.tv_desc_detail2);
        TextView overview = findViewById(R.id.tv_overview_detail2);

        CClubs mountain = getIntent().getParcelableExtra(EXTRA_CCLUBS);

        Glide.with(this).load(mountain.getPhoto()).into(imageView);
        name.setText(mountain.getName());
        description.setText(mountain.getDescription());
        overview.setText(mountain.getOverview());

    }
}