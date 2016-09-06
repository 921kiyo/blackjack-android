package com.example.user.blackjack;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by user on 05/09/2016.
 */
public class MenuActivity extends AppCompatActivity{
    TextView mEditText;
    Button mPlayButton;
    Button mRuleButton;
    AlertDialog.Builder ruleDialog;

    MediaPlayer backgroundMusic;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.menu_main);
        // background music
        backgroundMusic = MediaPlayer.create(MenuActivity.this, R.raw.background_music);
        backgroundMusic.setLooping(true);
        backgroundMusic.start();

        // Callback for play
        mPlayButton = (Button)findViewById(R.id.play);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, BettingActivity.class);
                startActivity(intent);
            }


        });

        mRuleButton = (Button)findViewById(R.id.rules);

//        mRuleButton.setOnClickListener(new View.OnClickListener(){
//            showRuleDialog();
//        });

    }

    @Override
    protected void onPause(){
        super.onPause();
        backgroundMusic.release();
        finish();
    }

    public void showRuleDialog(){
        ruleDialog = new AlertDialog.Builder(this);
        ruleDialog.setMessage(R.string.rule);
        ruleDialog.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){

            }
        });

        final AlertDialog alert = ruleDialog.create();
        alert.show();
    }
}
