package com.example.experiement5tailorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sizeChoice;
    RadioGroup radioGroup;
    RadioButton gender;
    Button submit;
    float height, price;
    EditText priceText;
    EditText heightText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sizeChoice = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sizes_available, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeChoice.setAdapter(adapter);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        submit = (Button) findViewById(R.id.submit);
        priceText = (EditText) findViewById(R.id.price);
        heightText = (EditText) findViewById(R.id.heightText);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("d", "cijdc");
                int radioId = radioGroup.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(radioId);
                String size = sizeChoice.getSelectedItem().toString();
                String selectedGender =  gender.toString();
                height = Float.parseFloat(heightText.getText()+ "");
                Log.i("size : ", size);
                Log.i("gender : ", selectedGender);

                if(selectedGender.equals("Male")){
                    if(size.equals("L")){
                        price = 300*height;
                    }else if(size.equals("XL")){
                        price = 400*height;
                    }else{
                        price = 500*height;
                    }
                }else{
                    if(size.equals("L")){
                        price = 500*height;
                    }else if(size.equals("XL")){
                        price = 700*height;
                    }else{
                        price = 900*height;
                    }
                }

                priceText.setText("" + price + "");
            }
        });


    }
}