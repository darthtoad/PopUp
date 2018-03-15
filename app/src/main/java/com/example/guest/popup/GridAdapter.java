package com.example.guest.popup;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Random;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private String[] words;
    private Typeface typeface;

    public GridAdapter (Context context, String[] words, Typeface typeface) {
        this.context = context;
        this.words = words;
        this.typeface = typeface;
    }

    @Override
    public int getCount() {
        return words.length;
    }

    @Override
    public Object getItem(int i) {
        Random random = new Random();
        i = random.nextInt(getCount() - 1);
        String word = words[i];
        return word;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (view == null) {
            gridView = inflater.inflate(R.layout.grid_grid_item, null);
            String word = this.words[i];

            TextView wordView = (TextView) gridView
                    .findViewById(R.id.grid_item_word);
            wordView.setText(this.getItem(i).toString());
            wordView.setTypeface(typeface);
        } else {
            gridView = (View) view;
        }
        return gridView;
    }
}