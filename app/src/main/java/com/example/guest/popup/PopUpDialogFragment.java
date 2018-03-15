package com.example.guest.popup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Guest on 3/14/18.
 */

public class PopUpDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AAAAH SOMETHING IS POPPING UP!");
        builder.setMessage("do u liek mudkipz?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getActivity(), GridActivity.class);
                startActivity(intent);
                dismiss();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "FAAAAAAAAAAAAHHHHHHHHHHK", Toast.LENGTH_LONG).show();
                dismiss();
            }
        });

        return builder.create();
    }
}
