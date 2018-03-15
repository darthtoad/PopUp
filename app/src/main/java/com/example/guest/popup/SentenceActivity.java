package com.example.guest.popup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SentenceActivity extends AppCompatActivity {
    @BindView(R.id.sentenceTextView) TextView sentenceTextView;
    @BindView(R.id.listView) ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        ArrayList<String> sentencesList = intent.getStringArrayListExtra("sentences");
        Log.d("thing", "sentencesList works!");
        String[] sentences = new String[sentencesList.size()];
        sentencesList.toArray(sentences);

        SentenceArrayAdapter adapter = new SentenceArrayAdapter(this, android.R.layout.simple_list_item_1, sentences);
        listView.setAdapter(adapter);
    }
}
