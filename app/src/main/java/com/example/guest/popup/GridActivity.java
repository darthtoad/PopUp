package com.example.guest.popup;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] words = {
                "Burnside", "Pitcairn", "ashen", "backpack", "bursal", "drippy", "katun", "lakelander", "spinneys", "traunch", "simonian", "agnolotti", "entorhinal", "entry-level", "fish-food", "funboard", "funnily", "mocked", "pin-up", "shadowboxes", "bronchotomhy", "choiceful", "craterlet", "exiles", "frount", "garcon", "humors", "megalomaniac", "rat-pit", "strobing"
        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PLUMP.ttf");
        GridView gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new GridAdapter(this, words, typeface));
    }
}
