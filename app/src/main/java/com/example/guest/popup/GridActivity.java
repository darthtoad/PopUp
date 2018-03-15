package com.example.guest.popup;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GridActivity extends AppCompatActivity {

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
}
