package com.ericawright.theresistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView = (TextView) findViewById(R.id.textView);
//
//        Button button = (Button) findViewById(R.id.newGame);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("It works!");
//            }
//        });
    }

    public void openNewActivity(View view) {
        Intent intent = new Intent(this, SetUpActivity.class);
        startActivity(intent);

    }
}
