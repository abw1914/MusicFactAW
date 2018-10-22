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

import com.android.musicfactoryaw.MusicData.Gospel;
import com.android.musicfactoryaw.R;

import java.util.ArrayList;

public class GospelAdapter extends ArrayAdapter<Gospel> {

    public GospelAdapter(@NonNull Context context,  ArrayList<Gospel> gospelArrayList) {
        super(context, 0, gospelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gospelListView = convertView;
        if (gospelListView == null) {
            gospelListView = LayoutInflater.from(getContext()).inflate(R.layout.gospel_list_item_view, parent, false);
        }
        Gospel gospel = getItem(position);

        TextView gospelAlbum = gospelListView.findViewById(R.id.gospel_album);
        gospelAlbum.setText(gospel.getArtist());

        TextView gospelGenre = gospelListView.findViewById(R.id.gospel_genre);
        gospelGenre.setText(gospel.getGenre());

        TextView gospelArtist = gospelListView.findViewById(R.id.gospel_artist);
        gospelArtist.setText(gospel.getArtist());

        TextView gospelTime = gospelListView.findViewById(R.id.gospel_song_time);
        gospelTime.setText(gospel.getSongLength());

        ImageView gospelFolderIcon = gospelListView.findViewById(R.id.gospel_list_item_icon);
        gospelFolderIcon.setImageResource(gospel.getResourceFolderId());

        return gospelListView;
    }


}