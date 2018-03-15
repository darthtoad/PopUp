package com.example.guest.popup;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SentenceArrayAdapter extends ArrayAdapter {
    private Context context;
    private String[] sentences;

    public SentenceArrayAdapter(Context context, int resource, String[] sentences) {
        super(context, resource);
        this.context = context;
        this.sentences = sentences;
    }

    @Override
    public Object getItem(int position) {
        return sentences[position];
    }

    @Override
    public int getCount() {
        return sentences.length;
    }
}
