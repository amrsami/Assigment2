package com.example.amr.assigment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.amr.assigment2.R.*;
import static com.example.amr.assigment2.R.layout.*;

class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] names) {
        super(context, custom_row ,names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView text = (TextView) customView.findViewById(id.name);
        ImageView image = (ImageView) customView.findViewById(id.imageView);

        text.setText(singleFoodItem);
        image.setImageResource(drawable.chunky);
        return customView;
    }
}
