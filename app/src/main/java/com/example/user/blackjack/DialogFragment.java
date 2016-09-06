package com.example.user.blackjack;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

/**
 * Created by user on 06/09/2016.
 */
public class DialogFragment extends android.app.DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder.create();
    }


    public void showDialog(String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Hello World");
        AlertDialog alert = builder.create();
        alert.show();
    }



}
