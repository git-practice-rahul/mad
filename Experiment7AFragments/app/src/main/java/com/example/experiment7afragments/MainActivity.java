package com.example.experiment7afragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.btn1);
        Button b2 = findViewById(R.id.btn2);
        Button b3 = findViewById(R.id.btn3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager1 = getSupportFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.fragmentContainer, Fragment1.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager2 = getSupportFragmentManager();
                manager2.beginTransaction()
                        .replace(R.id.fragmentContainer, Fragment2.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager3 = getSupportFragmentManager();
                manager3.beginTransaction()
                        .replace(R.id.fragmentContainer, Fragment3.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

    }
}