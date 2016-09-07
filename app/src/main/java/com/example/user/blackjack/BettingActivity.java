package com.example.user.blackjack;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 05/09/2016.
 */
public class BettingActivity extends AppCompatActivity{
    Button mEnterButton;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.betting_main);

        mEnterButton = (Button)findViewById(R.id.deal);
        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BettingActivity.this, MainActivity.class);
                if(GetterSetter.bet == 0){
                    Toast.makeText(BettingActivity.this, "Please add your bet", Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(intent);
                    playSound(R.raw.shuffle);
                }

            }
        });
    }

    private void playSound(int sound){
        if (mp != null){
            if (mp.isPlaying()||mp.isLooping()) {
                mp.stop();
            }
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(this,sound);
        mp.start();
    }

    private void displayCashTotal(int cashTotal){
        TextView cashTotalTextView = (TextView)findViewById(R.id.cashTotal);
        cashTotalTextView.setText("Cash Total:£" + cashTotal);
    }

    private void displayBet(int betTotal){
        TextView betTotalTextView = (TextView)findViewById(R.id.betTotal);
        betTotalTextView.setText("Bet Total:£" + betTotal);
    }

    public void clearBet(View view){
        GetterSetter.cash = GetterSetter.cash + GetterSetter.bet;
        GetterSetter.bet = 0;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
    }

    public void plusOne(View view){
        if (GetterSetter.cash == 0){ // if cash is 0, you cannot add
            return;
        }
        GetterSetter.cash = GetterSetter.cash - 1;
        GetterSetter.bet = GetterSetter.bet + 1;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
        playSound(R.raw.chips_short);
    }

    public void plusFive(View view){
        if (GetterSetter.cash < 5){ // if cash less than 5, you cannot add
            return;
        }
        GetterSetter.cash = GetterSetter.cash - 5;
        GetterSetter.bet = GetterSetter.bet + 5;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
        playSound(R.raw.chips_short);
    }

    public void plusTwentyFive(View view){
        if (GetterSetter.cash < 25){ // if cash less than 25, you cannot add
            return;
        }
        GetterSetter.cash = GetterSetter.cash - 25;
        GetterSetter.bet = GetterSetter.bet + 25;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
        playSound(R.raw.chips_short);
    }

    public void plusFifty(View view){
        if (GetterSetter.cash < 50){ // if cash less than 50, you cannot add
            return;
        }
        GetterSetter.cash = GetterSetter.cash - 50;
        GetterSetter.bet = GetterSetter.bet + 50;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
        playSound(R.raw.chips_short);
    }

    public void plusHundred(View view){
        if (GetterSetter.cash < 100){ // if cash less than 100, you cannot add
            return;
        }
        GetterSetter.cash = GetterSetter.cash - 100;
        GetterSetter.bet = GetterSetter.bet + 100;
        displayCashTotal(GetterSetter.cash);
        displayBet(GetterSetter.bet);
        playSound(R.raw.chips_short);
    }


}
