package com.android.musicfactoryaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.musicfactoryaw.MusicAdapters.ClassicalAdapter;
import com.android.musicfactoryaw.MusicAdapters.GospelAdapter;
import com.android.musicfactoryaw.MusicData.Classical;

import java.util.ArrayList;

public class ClassicalActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical);

        ArrayList<Classical> classicalArrayList = new ArrayList<Classical>();

        classicalArrayList.add(new Classical("Edvard Grieg","Peer Gynt Suite No. 1", "Morning Mood", R.drawable.classical_icon ));
        classicalArrayList.add(new Classical("Ludwig van Beethoven ","Symphony No. 5 In C Minor", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Antonio Vivaldi","The Four Seasons", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Richard Wagner","The Valkyrie: Ride of the Valkyries", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Frédéric Chopin","Nocturne No. 2 In E-Flat Major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Johann Sebastian Bach","Orchestral Suite No. 3 in D major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Gustav Holst","The Planets", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Claude Debussy","Suite bergamasque", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Giuseppe Verdi","Nabucco: Chorus of the Hebrew Slaves", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Wolfgang Amadeus Mozart","Piano Concerto No. 21 in C major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Johann Sebastian Bach","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Antonín Dvořák","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Johann Strauss II","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Johannes Brahms","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Pyotr Ilyich Tchaikovsky","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Wolfgang Amadeus Mozart","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));
        classicalArrayList.add(new Classical("Ludwig van Beethoven","Brandenburg Concerto No. 3 in G major", "Morning Mood", R.drawable.classical_icon  ));

        ClassicalAdapter classicalAdapter = new ClassicalAdapter(this, classicalArrayList);
        ListView listView = findViewById(R.id.classical_list_view);
        listView.setAdapter(classicalAdapter);
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
