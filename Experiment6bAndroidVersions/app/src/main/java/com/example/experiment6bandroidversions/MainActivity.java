package com.example.experiment6bandroidversions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] states = { "Android Version 1.0 to 1.1", "Android Version 1.5: Cupcake", "Android Version 1.6: Donut", "Android Version 2.0 to 2.1: Eclair",
    "Android Version 2.2 to 2.2.3: Froyo", "Android Version 2.3 to 2.3.7: Gingerbread", "Android Version 3.0 to 3.2.6: Honeycomb", "Android Version 4.0 to 4.0.4: Ice Cream Sandwich", "Android Version 4.1 to 4.3.1: Jelly Bean", "Android Version 4.4 to 4.4.4: KitKat", "Android Version 5.0 to 5.1.1: Lollipop", "Android Version 6.0 to 6.0.1: Marshmallow", "Android Version 7.0 to 7.1.2: Nougat", "Android Version 8.0 to 8.1: Oreo", "Android Version 9.0: Pie", "Android Version 10", "Android Version 11", "Android Version 12", "Android Version 13"};

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view, states);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}