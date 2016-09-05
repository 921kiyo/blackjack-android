package com.example.user.blackjack;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 02/09/2016.
 */
public class MainActivity extends AppCompatActivity {
    Button button;
    FragmentManager fragmentManager;// Return the FragmentManager for interacting with fragments associated with this activity.
    MainActivityFragment fragment;
    int n = 0;
    TextView textView = null;
    int cardn  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button2);
        fragmentManager = getSupportFragmentManager(); //get fragment manager to create transactions for adding, removing and replacing fragments
        fragment = (MainActivityFragment)fragmentManager.findFragmentById(R.id.fragment);
        textView = fragment.textviewPlayer;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickMethodHit(View view){ // Hit button
        if(GetterSetter.isStanding == false){
            GetterSetter.playerScore  = 0;
            GetterSetter.dealerScore = 0;
            GetterSetter.hit++;
            GetterSetter.bottunPressed = 1;
        }

    }
    public void clickMethodStand(View view){ // stand button
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.dealerHit = GetterSetter.hit; // when stand pressed, assign dealerHit to be equal to hit
        GetterSetter.bottunPressed = 1;
        GetterSetter.isStanding = true;
    }

    public void clickMethodRedeal(View view){ // redeal button
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.hit = 3;
        GetterSetter.dealerHit = 1;
        GetterSetter.bottunPressed = 1;
        GetterSetter.isStanding = false;

    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
