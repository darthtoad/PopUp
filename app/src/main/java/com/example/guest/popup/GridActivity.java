package com.example.guest.popup;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GridActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.button) Button button;
    @BindView(R.id.addSentence) EditText addSentence;

    ArrayList<String> sentences = new ArrayList<String>();

    public ArrayList<String> getRandomWords(ArrayList<String> words) {
        ArrayList randomWordsFinal = new ArrayList<String>();
        for (int j = 0; j < 6; j++) {
            Random random = new Random();
            int i = random.nextInt(words.size() - 1);
            String word = words.get(i);
            randomWordsFinal.add(word);
            words.remove(word);
        }
        return randomWordsFinal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        ButterKnife.bind(this);
        button.setOnClickListener(this);
        String[] words = {
                "Burnside", "Pitcairn", "ashen", "backpack", "bursal", "drippy", "katun", "lakelander", "spinneys", "traunch", "simonian", "agnolotti", "entorhinal", "entry-level", "fish-food", "funboard", "funnily", "mocked", "pin-up", "shadowboxes", "bronchotomhy", "choiceful", "craterlet", "exiles", "frount", "garcon", "humors", "megalomaniac", "rat-pit", "strobing"
        };
        ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
        ArrayList<String> listRandomWords = getRandomWords(wordsList);
        String[] randomWords = new String[6];
        randomWords = listRandomWords.toArray(randomWords);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PLUMP.ttf");
        GridView gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new GridAdapter(this, randomWords, typeface));
    }

    @Override
    public void onClick(View v) {
        if (v == button) {
            Log.d("things", "onClick works");
            String sentence = addSentence.getText().toString();
            sentences.add(sentence);
            Intent intent = new Intent(GridActivity.this, SentenceActivity.class);
            intent.putStringArrayListExtra("sentences", sentences);
            startActivity(intent);
        }
    }

//    @Override
//    public void onLongClick(View v) {
//        if (v == button) {
//            Toast toast = new Toast;
//
//        }
//    }


}
