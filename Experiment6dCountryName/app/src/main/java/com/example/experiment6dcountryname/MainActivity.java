package com.example.experiment6dcountryname;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] countryNames = {"Country: India", "Country: Pakistan", "Country: Sri Lanka", "Country: China", "Country: Bangladesh", "Country: Nepal"};
    private String[] currencyNames = {"Currency: Indian Rupee", "Currency: Pakistani Rupee", "Currency: Sri Lankan Rupee", "Currency: Remminbi", "Currency: Bangladeshi Takka", "Currency: Nepalese Rupee"};
    private Integer[] imageid = {R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,R.drawable.photo5, R.drawable.photo6};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.list);

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(this, countryNames, currencyNames, imageid);
        listView.setAdapter(customArrayAdapter);

    }
}