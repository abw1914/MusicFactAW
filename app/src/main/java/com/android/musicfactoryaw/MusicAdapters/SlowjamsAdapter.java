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

import com.android.musicfactoryaw.MusicData.SlowJams;
import com.android.musicfactoryaw.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SlowjamsAdapter extends ArrayAdapter<SlowJams> {

    public SlowjamsAdapter(@NonNull Context context,  ArrayList<SlowJams> slowJamsArrayList) {
        super(context, 0, slowJamsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View slowjamsListView = convertView;
        if(slowjamsListView == null) {
            slowjamsListView = LayoutInflater.from(getContext()).inflate(R.layout.slowjams_list_item_view, parent, false);
        }
        SlowJams slowJams = getItem(position);

        TextView slowJamsArtist = slowjamsListView.findViewById(R.id.slowjams_artist);
        slowJamsArtist.setText(slowJams.getArtist());

        TextView slowJamsAlbum = slowjamsListView.findViewById(R.id.slowjams_album);
        slowJamsAlbum.setText(slowJams.getAlbum());

        TextView slowJamsSong = slowjamsListView.findViewById(R.id.slowjams_song);
        slowJamsSong.setText(slowJams.getSong());

        ImageView slowJamsFolderIcon = slowjamsListView.findViewById(R.id.slowjams_list_item_icon);
        slowJamsFolderIcon.setImageResource(slowJams.getResourceImageId());

        return slowjamsListView;
    }
}
