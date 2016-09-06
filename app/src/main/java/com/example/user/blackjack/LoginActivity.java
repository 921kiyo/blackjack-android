package com.example.user.blackjack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 05/09/2016.
 */
public class LoginActivity extends AppCompatActivity {

    EditText mEditText;
    Button mEnterButton;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        mEditText = (EditText)findViewById(R.id.name_text);
        mEnterButton = (Button)findViewById(R.id.enter);

        mEnterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = mEditText.getText().toString();

                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}
