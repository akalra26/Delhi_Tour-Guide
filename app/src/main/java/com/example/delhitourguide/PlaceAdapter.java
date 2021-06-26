package com.example.delhitourguide;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter {

    private int mColorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentWord = (Place) getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentWord.getmName());

        TextView placeTextView = listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentWord.getmPlace());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

    public static final String LOG_TAG = PlaceAdapter.class.getSimpleName();
}