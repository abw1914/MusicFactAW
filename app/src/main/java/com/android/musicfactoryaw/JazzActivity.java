package com.android.musicfactoryaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListView;

import com.android.musicfactoryaw.MusicAdapters.JazzAdapter;
import com.android.musicfactoryaw.MusicData.Jazz;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        ArrayList<Jazz> jazzArrayList = new ArrayList<Jazz>();

        jazzArrayList.add(new Jazz("Miles Davis", "So What", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("John Coltrane", "My Favorite Things", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Dave Brubeck", "Take Five", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("John Coltrane", "Acknowledgement", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Weather Report", "Birdland", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Miles Davis", "Freddie Freeloader", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("John Coltrane", "Psalm", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Billie Holiday", "Strange Fruit", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Dizzy Gillespie", "Salt Peanuts", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Cannonball Adderley", "Mercy, Mercy, Mercy", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Charles Mingus", "Goodbye Pork Pie Hat", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Herbie Hancock", "Chameleon", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Freddie Hubbard", "Straight Life", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Pharoah Sanders", "The Creator Has a Master Plan", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Miles Davis", "Blue in Green", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Wes Montgomery", "Bumpin' on Sunset", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("John Coltrane", "Naima", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Jimmy Smith", "Back at the Chicken Shack", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Count Basie", "One o'Clock Jump", R.drawable.jazz_icon));
        jazzArrayList.add(new Jazz("Grover Washington", "Mister Magic", R.drawable.jazz_icon));

        JazzAdapter jazzArrayAdapter = new JazzAdapter(this,  jazzArrayList);
        ListView listView = findViewById(R.id.jazz_list_view);
        listView.setAdapter(jazzArrayAdapter);
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


