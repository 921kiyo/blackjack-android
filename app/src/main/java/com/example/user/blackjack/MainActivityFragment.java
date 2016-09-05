package com.example.user.blackjack;

import android.support.v4.app.Fragment; // part of activity you can use over and over again (reusable)
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import java.util.Collections;
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
    TextView textviewDealer;
    TextView textviewCash;
    TextView textviewBet;
    Handler mHandler;

    public MainActivityFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, // inflater xml as input and builds view object from it
                             Bundle savedInstanceState){ // passing data bet activities
        rootView = inflater.inflate(R.layout.fragment_main,container, false); //??

        textviewPlayer = (TextView) rootView.findViewById(R.id.playerScore);
        textviewPlayer.setTextColor(Color.WHITE);

        textviewDealer = (TextView) rootView.findViewById(R.id.dealerScore);
        textviewDealer.setTextColor(Color.WHITE);

        textviewCash = (TextView) rootView.findViewById(R.id.cash);
        textviewCash.setTextColor(Color.WHITE);

        textviewBet = (TextView) rootView.findViewById(R.id.bet);
        textviewBet.setTextColor(Color.RED);

        rootView.setBackgroundColor(Color.GREEN);

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
        mHandler.post(mUpdate);
        return rootView;
    }
    private Runnable mUpdate = new Runnable() {
        @Override
        public void run() {

            if(GetterSetter.playerScore <= 21){
                textviewPlayer.setText("Player: " + GetterSetter.playerScore + " ");
                textviewDealer.setText("Dealer: " + GetterSetter.dealerScore + " ");
                textviewCash.setText("Cash: " + (GetterSetter.cash) + " ");
                textviewBet.setText("Bet: " + GetterSetter.bet + " ");
            }
            else{
                textviewPlayer.setText("Bust!");
                GetterSetter.bet = 0; // reset bet amount
                GetterSetter.isStanding = true;
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


            mHandler.postDelayed(this,1); //???
        }
    };
    public void judgeWin(){
        if(GetterSetter.playerScore > GetterSetter.dealerScore || GetterSetter.dealerScore > 21){
            // Player win!!
            GetterSetter.cash = GetterSetter.cash + (GetterSetter.bet * 2);
            GetterSetter.bet = 0;
        }
        else{
            // Dealer win! take betting amount
            GetterSetter.bet = 0;
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
