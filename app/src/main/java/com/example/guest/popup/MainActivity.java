package com.example.guest.popup;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        PopUpDialogFragment builder = new PopUpDialogFragment();
        builder.show(fm, "PopUpFragment");
    }
}
