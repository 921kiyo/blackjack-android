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

import java.util.Random;


/**
 * Created by user on 02/09/2016.
 */
public class MainActivityFragment extends Fragment {
    Button button;
    Card[] deck;
    int n = 0;
    View rootView;
    TextView textview;
    Handler mHandler;

    public MainActivityFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, // inflater xml as input and builds view object from it
                             Bundle savedInstanceState){ // passing data bet activities
        rootView = inflater.inflate(R.layout.fragment_main,container, false); //??
        textview = (TextView) rootView.findViewById(R.id.textView);
        textview.setTextColor(Color.WHITE);
        rootView.setBackgroundColor(Color.GREEN);

        deck = new Card[52];
        for(int suit = 0; suit < 4; suit++){
            for (int rank = 0; rank < 13; rank++ ){
                deck[n] = new Card(suit,rank);
                n++;
            }


        }
        GetterSetter.card = deck;

        mHandler = new Handler();
        mHandler.post(mUpdate);
        return rootView;
    }
    private Runnable mUpdate = new Runnable() {
        @Override
        public void run() {
            textview.setText("" + GetterSetter.playerScore + "");
            mHandler.postDelayed(this,1); //???
        }
    };

//    public Card[] shuffleDeck(Card[] deck){
//        Random random = new Random();
//    }

}
