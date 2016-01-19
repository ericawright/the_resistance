package com.ericawright.theresistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StartGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        Intent intent = getIntent();
        String number = intent.getStringExtra("PlayerNum");
//        String number = intent.getStringExtra(SetUpActivity.PlayerNum);
        TextView textView = (TextView) findViewById(R.id.numPlayers);
        textView.setText(number);
    }
}
