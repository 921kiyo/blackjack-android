package com.example.user.blackjack;

import android.app.AlertDialog;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment; // part of activity you can use over and over again (reusable)
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

import java.util.Random;


/**
 * Created by user on 02/09/2016.
 */
public class MainActivityFragment extends Fragment {
    Button button;
    Card[] deck;
    int n = 0;
    View rootView;
    TextView textviewPlayer;
    static TextView textviewDealer;
    TextView textviewCash;
    TextView textviewBet;
    Handler mHandler;
    MediaPlayer mp;
    AlertDialog.Builder bustMessage;
    AlertDialog.Builder blackJackMessage;
    ImageView image;

    public MainActivityFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, // inflater xml as input and builds view object from it
                             Bundle savedInstanceState){ // passing data bet activities
        rootView = inflater.inflate(R.layout.fragment_main,container, false); //??

        textviewPlayer = (TextView) rootView.findViewById(R.id.playerScore);
        textviewPlayer.setTextColor(Color.WHITE);
        textviewPlayer.setTextSize(20);

        textviewDealer = (TextView) rootView.findViewById(R.id.dealerScore);
        textviewDealer.setTextColor(Color.WHITE);
        textviewDealer.setTextSize(20);

        textviewCash = (TextView) rootView.findViewById(R.id.cash);
        textviewCash.setTextColor(Color.WHITE);
        textviewCash.setTextSize(20);

        textviewBet = (TextView) rootView.findViewById(R.id.bet);
        textviewBet.setTextColor(Color.WHITE);
        textviewBet.setTextSize(20);

//        rootView.setBackgroundResource(R.drawable.casino_table);
//
//        rootView.setBackgroundColor(Color.GREEN);

        deck = new Card[52];
        for(int suit = 0; suit < 4; suit++){
            for (int rank = 0; rank < 13; rank++ ){
                deck[n] = new Card(suit,rank);
                n++;
            }
        }
        GetterSetter.card = deck;
        deck = shuffleDeck(deck);

        mHandler = new Handler();
        mHandler.post(mUpdate); //??
        return rootView;
    }

    private void playSound(int sound){
        if (mp != null){
            if (mp.isPlaying()||mp.isLooping()) {
                mp.stop();
            }
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(getContext(),sound);
        mp.start();
    }

    public void bustDialog(){
        bustMessage = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.bust_dialog,null);
        bustMessage.setView(dialogLayout);
        bustMessage.setMessage("Bust");

        final AlertDialog alert = bustMessage.create();
        alert.show();
        new CountDownTimer(1000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onFinish() {
                // TODO Auto-generated method stub
                alert.dismiss();
            }
        }.start();
    }

    public void blackJackDialog(){
        blackJackMessage = new AlertDialog.Builder(getContext());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.black_jack_dialog,null);
        blackJackMessage.setView(dialogLayout);
        blackJackMessage.setMessage("Black Jack!!");

        final AlertDialog alert = blackJackMessage.create();
        alert.show();
        new CountDownTimer(1000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // TODO Auto-generated method stub
            }
            @Override
            public void onFinish() {
                // TODO Auto-generated method stub
                alert.dismiss();
            }
        }.start();
    }

    private Runnable mUpdate = new Runnable() {
        @Override
        public void run() {
            if (GetterSetter.playerScore == 21){
                /// Black Jack
                textviewPlayer.setText("Player: " + GetterSetter.playerScore + " ");
                textviewDealer.setText("Dealer: " + GetterSetter.dealerScore + " ");
                textviewCash.setText("Cash: " + (GetterSetter.cash) + " ");
                textviewBet.setText("Bet: " + GetterSetter.bet +  " ");
                GetterSetter.isBlackJack = true;
                GetterSetter.isStanding = true;
                if(GetterSetter.playerBlackjack == 0){
                    GetterSetter.playerBlackjack = 1;
                }
                judgeWin();
            }

            else if(GetterSetter.playerScore < 21){
                textviewPlayer.setText("Player: " + GetterSetter.playerScore + " ");
                textviewDealer.setText("Dealer: " + GetterSetter.dealerScore + " ");
                textviewCash.setText("Cash: " + (GetterSetter.cash) + " ");
                textviewBet.setText("Bet: " + GetterSetter.bet + " ");
            }
            else{
                textviewPlayer.setText("Bust!");
                if(GetterSetter.playerBust ==0){
                    GetterSetter.playerBust = 1;
                }
                judgeWin();
            }
            if(GetterSetter.bottunPressed == 0){
                if(GetterSetter.dealerHit > 1){
                    if(GetterSetter.dealerScore < 17 && GetterSetter.dealerScore != 0){ // if the dealer's hands is less than 17, take another hit
                        GetterSetter.playerScore = 0;
                        GetterSetter.dealerScore = 0;
                        GetterSetter.dealerHit++;
                        GetterSetter.bottunPressed = 1;
                    }
                    else{
                        judgeWin();
                    }
                }
            }

            if(GetterSetter.playerBlackjack == 1){
                playSound(R.raw.congratulations);
                blackJackDialog();
                GetterSetter.playerBlackjack = 2;
            }
            if(GetterSetter.playerBust == 1){
                // when player bust_dialog, reveal dealer's card and score
                playSound(R.raw.oh_loud);
                bustDialog();
                judgeWin();
                GetterSetter.playerBust = 2;
            }
            if(GetterSetter.playerBust > 1){
                textviewDealer.setText("Dealer: " + GetterSetter.dealerScore + " ");
            }

            mHandler.postDelayed(this,1); //Causes the Runnable r to be added to the message queue, to be run after the specified amount of time elapses
        }
    };

    public void judgeWin(){
        if (GetterSetter.playerScore > 21){

        }
        else if(GetterSetter.dealerScore > 21){
            textviewDealer.setText("Bust!");

        }
        else if(GetterSetter.playerScore > GetterSetter.dealerScore){

        }
        else if (GetterSetter.playerScore == GetterSetter.dealerScore){
            textviewPlayer.setText("Push!");
            textviewDealer.setText("Push!");
        }
        else{

        }
    }

    public Card[] shuffleDeck(Card[] deck){
        Random random = new Random();
        Card cardHolder = new Card(0,0);
        for (int n = 0; n <52; n++){
            int randomIndex = random.nextInt(52);
            cardHolder = deck[randomIndex]; // assign randomth card to the first card(cardHolder)
            deck[randomIndex] = deck[n]; // assign the first card to randomth card (swapping the two cards)
            deck[n] = cardHolder;

        }
        return deck;
    }




}
