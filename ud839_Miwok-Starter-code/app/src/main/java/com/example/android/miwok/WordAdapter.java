package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abinash Patra on 16-Mar-17.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int mclors;

    public WordAdapter(Activity context, ArrayList<Word> wordss,int color) {
        super(context, 0, wordss);
        mclors=color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }
        Word currentword = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text4);
        nameTextView.setText(currentword.englishmethod());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text3);
        numberTextView.setText(currentword.miwokmethod());
        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        if (currentword.imageornot()) {
            imageview.setImageResource(currentword.imagemethod());
        }
        else
        {
            imageview.setVisibility(View.GONE);
        }
        View textcofsn =listItemView.findViewById(R.id.container);
        int coloor= ContextCompat.getColor(getContext(),mclors);
        textcofsn.setBackgroundColor(coloor);
        return listItemView;
    }

}

