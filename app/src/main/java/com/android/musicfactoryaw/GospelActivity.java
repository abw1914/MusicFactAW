package com.android.musicfactoryaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.musicfactoryaw.MusicAdapters.GospelAdapter;
import com.android.musicfactoryaw.MusicAdapters.JazzAdapter;
import com.android.musicfactoryaw.MusicData.Gospel;
import com.android.musicfactoryaw.MusicData.Jazz;

import java.util.ArrayList;

public class GospelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel);

        ArrayList<Gospel> gospelArrayList = new ArrayList<Gospel>();

        gospelArrayList.add(new Gospel("Shine for Jesus", "Sister Rosetta Tharpe","Traditional", "1:54", R.drawable.gospel_icon ));
        gospelArrayList.add(new Gospel("Down by the Riverside", "Louis Armstrong","Traditional", "1:34", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Amazing Grace", "Mahalia Jackson","Traditional", "1:54", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Ol' Man River", "Paul Robeson","Oscar Hammerstein II", "2:50", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Preacher and the Bear", "Golden Gate Quartet","Traditional", "2:50", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Hold On!", "Shirley Verrett","Traditional", "154", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Dear Jesus Abide with Me", "The Oak Ridge Boys","Traditional", "2:52", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Hark! The Herald Angels Sing", "Mahalia Jackson","Traditional", "3:00", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel(" Family Prayer", " Sister Rosetta Tharpe","Modern", "1:26", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Oh, the Joy That Came to Me", "Southern Mission Choir","Traditional", "1:26", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Talk About Jesus", "Mississippi Singers","Contemporary", "2:03", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Joshua Fit the Battle of Jericho", "Paul Robeson","Contemporary", "1:58", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("The Lord's Prayer", "Mahalia Jackson","Contemporary", "3:08", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("He's the Only One", "The Kingsmen","Contemporary", "2:38", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("He's Got the Whole World in His Hands", "Webb Pierce","Contemporary", "2:20", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Swing Low, Sweet Chariot", "Paul Robeson","Traditional", "2:20", R.drawable.gospel_icon  ));
        gospelArrayList.add(new Gospel("Nothing Between", "Sister Rosetta Tharpe","Contemporary", "2:23" , R.drawable.gospel_icon ));
        gospelArrayList.add(new Gospel("O Glory", "Shirley Verrett","Contemporary", "5:00", R.drawable.gospel_icon  ));

        GospelAdapter gospelArrayAdapter = new GospelAdapter(this, gospelArrayList);
        ListView listView = findViewById(R.id.gospel_list_view);
        listView.setAdapter(gospelArrayAdapter);

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

