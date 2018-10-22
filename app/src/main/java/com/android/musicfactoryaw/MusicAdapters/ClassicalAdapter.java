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

import com.android.musicfactoryaw.MusicData.Classical;
import com.android.musicfactoryaw.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ClassicalAdapter extends ArrayAdapter<Classical> {
    public ClassicalAdapter(@NonNull Context context, ArrayList<Classical> classicalArrayList) {
        super(context, 0, classicalArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View classicalArrayList = convertView;
        if(classicalArrayList == null) {
            classicalArrayList = LayoutInflater.from(getContext()).inflate(R.layout.classical_list_item_view, parent, false);
        }
        Classical classical = getItem(position);

        /**
         * These text views correspond to the textviews in the classical_list_item_view.xml
         */

        TextView classicalCompowser = classicalArrayList.findViewById(R.id.classical_composer);
        classicalCompowser.setText(classical.getComposer());

        TextView classicalOrchestra = classicalArrayList.findViewById(R.id.classical_orchersta);
        classicalOrchestra.setText(classical.getOrchestra());

        TextView classicalTitle = classicalArrayList.findViewById(R.id.classical_title);
        classicalTitle.setText(classical.getTitle());

        ImageView classicalFolderIcon = classicalArrayList.findViewById(R.id.classical_list_item_icon);
        classicalFolderIcon.setImageResource(classical.getImageResourceId());

        return classicalArrayList;
    }
}



