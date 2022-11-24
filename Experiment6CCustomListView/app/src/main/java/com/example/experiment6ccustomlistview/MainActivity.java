package com.example.experiment6ccustomlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] fruitNames = {"Apple", "Banana", "Strawberry", "Pineapple", "Grapes", "Mango"};
    private Integer[] imageid = {25,3354,354,3,3};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.list);

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(this, fruitNames, imageid);
        listView.setAdapter(customArrayAdapter);

    }
}