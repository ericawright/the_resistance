package com.ericawright.theresistance;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.NumberPicker;

public class SetUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);
        NumberPicker np= (NumberPicker) findViewById(R.id.numberPicker);
        np.setMaxValue(9);
        np.setMinValue(0);
        np.setWrapSelectorWheel(false);
    }

    public void openStartGameActivity(View view) {
        Intent intent = new Intent(this, StartGameActivity.class);
        startActivity(intent);

    }
}
