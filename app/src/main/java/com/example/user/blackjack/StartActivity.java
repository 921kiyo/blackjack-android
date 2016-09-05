package com.example.user.blackjack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by user on 05/09/2016.
 */
public class StartActivity extends AppCompatActivity{
    TextView mEditText;
    Button mPlayButton;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.start_main);
        // Getting name from login page
        mEditText = (TextView)findViewById(R.id.input_name);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String name = extras.getString("name");
        mEditText.setText(name);

        // Callback for play
        mPlayButton = (Button)findViewById(R.id.play);

        mPlayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this, MenuActivity.class);
                startActivity(intent);
            }



        });

    }
}
