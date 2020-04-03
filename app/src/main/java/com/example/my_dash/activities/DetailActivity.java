package com.example.my_dash.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my_dash.R;

import com.example.my_dash.models.DClubs;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DCLUBS = "extra_dclubs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView overview = findViewById(R.id.tv_overview_detail);

        DClubs mountain = getIntent().getParcelableExtra(EXTRA_DCLUBS);

        Glide.with(this).load(mountain.getPhoto()).into(imageView);
        name.setText(mountain.getName());
        description.setText(mountain.getDescription());
        overview.setText(mountain.getOverview());

    }
}
