package com.android.musicfactoryaw;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Music Top 50");

        ImageButton classicActivity = findViewById(R.id.classic_cover);
        classicActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(numbersIntent);
            }
        });

        ImageButton gospelActivity = findViewById(R.id.gospel_cover);
        gospelActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gospetIntent = new Intent(MainActivity.this, GospelActivity.class);
                startActivity(gospetIntent);
            }
        });

        ImageButton jazzActivity = findViewById(R.id.jazz_cover);
        jazzActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }
        });

        ImageButton slowJamActivity = findViewById(R.id.slowjams_cover);
        slowJamActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowJamIntent = new Intent(MainActivity.this, SlowJamActivity.class);
                startActivity(slowJamIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
