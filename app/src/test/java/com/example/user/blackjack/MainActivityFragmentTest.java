package com.example.user.blackjack;
import android.app.AlertDialog;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/09/2016.
 */
public class MainActivityFragmentTest {
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
    AlertDialog.Builder sample;
    ImageView image;

    @Before
    public void before(){
        textviewDealer = (TextView) rootView.findViewById(R.id.dealerScore);
        textviewPlayer = (TextView) rootView.findViewById(R.id.playerScore);
        textviewCash = (TextView) rootView.findViewById(R.id.cash);
        textviewCash = (TextView) rootView.findViewById(R.id.cash);

    }

    @Test
    public void mUpdateTest(){
        GetterSetter.playerScore = 21;
//        assertEquals(true, MainActivityFragment.mUpdate);

    }

    @Test
    public void judgeWinTest(){
        GetterSetter.dealerScore = 21;
        GetterSetter.bet = 1000;
        MainActivityFragment mainActivityFragment = new MainActivityFragment();
        mainActivityFragment.judgeWin();
        assertEquals(5000, GetterSetter.cash);
    }


}
