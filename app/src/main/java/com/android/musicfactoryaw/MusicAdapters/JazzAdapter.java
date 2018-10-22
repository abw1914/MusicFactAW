package com.android.musicfactoryaw.MusicAdapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.musicfactoryaw.MusicData.Jazz;
import com.android.musicfactoryaw.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JazzAdapter extends ArrayAdapter<Jazz> {

    public JazzAdapter(@NonNull Context context,  ArrayList<Jazz> jazzArrayList) {
        super(context, 0, jazzArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View jazzArrayList = convertView;
        if(jazzArrayList == null) {
            jazzArrayList = LayoutInflater.from(getContext()).inflate(R.layout.jazz_list_item_view, parent, false);
        }

        Jazz jazz = getItem(position);

        TextView jazzArtist =jazzArrayList.findViewById(R.id.jazz_artist);
        jazzArtist.setText(jazz.getArtist());

        TextView jazzSong = jazzArrayList.findViewById(R.id.jazz_song);
        jazzSong.setText(jazz.getSong());

        ImageView jazzImageIcon = jazzArrayList.findViewById(R.id.jazz_list_item_icon);
        jazzImageIcon.setImageResource(jazz.getResourceJazzIcon());

        return jazzArrayList;
    }
}
