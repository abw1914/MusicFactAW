package com.android.musicfactoryaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.musicfactoryaw.MusicAdapters.JazzAdapter;
import com.android.musicfactoryaw.MusicAdapters.SlowjamsAdapter;
import com.android.musicfactoryaw.MusicData.Jazz;
import com.android.musicfactoryaw.MusicData.SlowJams;

import java.util.ArrayList;

public class SlowJamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slowjams);


        ArrayList<SlowJams> slowJamsArrayList = new ArrayList<SlowJams>();

        slowJamsArrayList.add(new SlowJams("HEAT WAVE", "The Best of Heatwave - Always and Forever", "Always and Forever", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("K-Ci & JoJo", "All My Life / Tell Me It's Real", "All My Life", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Keith Sweat", "The Best of Keith Sweat", "Make You Sweat", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("MC Magic of NB Ridaz", "DONT WORRY", "Lost In Love", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Mariah Carey", "We Belong Together", "We Belong Together", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Silk", "Lose Control", "Freak Me", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Boyz II Men", "Boyz II Men: Legacy - The Greatest Hits Collection", "I'll Make Love to You", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Luther Vandross", "The Life", "Differences", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Marvin Gaye", "Let's Get It On", "Let's Get It On", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Marvin Gaye", "Midnight Love & the Sexual Healing Sessions", "Sexual Healing", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("K-Ci & JoJo", "X", "Crazy", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Lenny Williams", "Ultimate Collection: Lenny Williams", "Cause I Love You", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("Usher", "My Way", "Nice & Slow", R.drawable.rnb_icon));
        slowJamsArrayList.add(new SlowJams("The Deele", "The Deele Greatest Hits", "Two Occasions", R.drawable.rnb_icon));

        SlowjamsAdapter slowjamsAdapter = new SlowjamsAdapter(this, slowJamsArrayList);
        ListView listView = findViewById(R.id.slowjams_list_view);
        listView.setAdapter(slowjamsAdapter);

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

