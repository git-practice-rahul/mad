package com.example.experiment5diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button randomButton;
    EditText box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomButton = (Button) findViewById(R.id.randomButton);
        box = (EditText) findViewById(R.id.box);

        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box.setText(null);
                int r =(int)( Math.random()*10000)%6 + 1 ;
                box.setText("" + r);
            }
        });
    }
}