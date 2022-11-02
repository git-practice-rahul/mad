package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bPow, bDecimal, bEqual, bClear;
    EditText num1, num2, res;
    boolean add, sub, mul, div, pow, operation;
    float val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "On create called", Toast.LENGTH_SHORT).show();
        
        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        bAdd = (Button) findViewById(R.id.add);
        bSub = (Button) findViewById(R.id.sub);
        bMul = (Button) findViewById(R.id.multiply);
        bDiv = (Button) findViewById(R.id.divide);
        bPow = (Button) findViewById(R.id.pow);
        bDecimal = (Button) findViewById(R.id.decimal);
        bEqual = (Button) findViewById(R.id.equal);
        bClear = (Button) findViewById(R.id.C);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        res = (EditText) findViewById(R.id.msgBox);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "0");
                }else{
                    num2.setText(num2.getText() + "0");
                }
            }
        });
         b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "1");
                }else{
                    num2.setText(num2.getText() + "1");
                }
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "2");
                }else{
                    num2.setText(num2.getText() + "2");
                }
            }
        });
         b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "3");
                }else{
                    num2.setText(num2.getText() + "3");
                }
            }
        });
         b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "4");
                }else{
                    num2.setText(num2.getText() + "4");
                }
            }
        });
         b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "5");
                }else{
                    num2.setText(num2.getText() + "5");
                }
            }
        });
         b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "6");
                }else{
                    num2.setText(num2.getText() + "6");
                }
            }
        });
         b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "7");
                }else{
                    num2.setText(num2.getText() + "7");
                }
            }
        });
         b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "8");
                }else{
                    num2.setText(num2.getText() + "8");
                }
            }
        });
         b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + "9");
                }else{
                    num2.setText(num2.getText() + "9");
                }
            }
        });
         bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation == false){
                    num1.setText(num1.getText() + ".");
                }else{
                    num2.setText(num2.getText() + ".");
                }
            }
        });


         bClear.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 num1.setText(null);
                 num2.setText(null);
                 res.setText(null);
                 operation = false;
                 add = false;
                 sub = false;
                 div = false;
                 mul = false;
                 pow = false;

             }
         });

         bAdd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.getText().length() != 0){
                     val1 = Float.parseFloat(num1.getText()+"");
                     add = true;
                     operation = true;
                 }
             }
         });
         bSub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.getText().length() != 0){
                     val1 = Float.parseFloat(num1.getText()+"");
                     sub = true;
                     operation = true;
                 }
             }
         });
         bMul.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.getText().length() != 0){
                     val1 = Float.parseFloat(num1.getText()+"");
                     mul = true;
                     operation = true;
                 }
             }
         });
         bDiv.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.getText().length() != 0){
                     val1 = Float.parseFloat(num1.getText()+"");
                     div = true;
                     operation = true;
                 }
             }
         });
         bPow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.getText().length() != 0){
                     val1 = Float.parseFloat(num1.getText()+"");
                     pow = true;
                     operation = true;
                 }
             }
         });


         bEqual.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(num1.length() != 0){
                     val2 = Float.parseFloat(num2.getText() + "");
                     if(add){
                         res.setText(val1 + val2 + "");
                         add = false;

                     }
                     if(mul){
                         res.setText((val1 * val2) + "");
                         mul = false;
                     }
                     if(sub){
                         res.setText((val1 - val2) + "");
                         sub = false;
                     }
                     if(div){
                         res.setText((val1 / val2) + "");
                         div = false;
                     }
                     if(pow){
                         double v = Math.pow(val1, val2);
                         res.setText(v + "");
                         pow = false;
                     }
                    operation = false;
                 }
             }
         });



    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On restart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity is going to pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity is going to stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity is going to be destroyed", Toast.LENGTH_SHORT).show();
    }
}