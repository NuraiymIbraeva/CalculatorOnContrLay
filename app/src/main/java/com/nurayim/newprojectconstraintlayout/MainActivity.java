package com.nurayim.newprojectconstraintlayout;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button divisionButton, multiply, minus, equally,
            seven, eight, nine, four, five, six,
            one, two, three, zero, comma, plus;
    EditText numberFiled;

    float mValueOne, mValueTwo;


    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crynchifyDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        five = findViewById(R.id.five);
        minus = findViewById(R.id.minus);
        divisionButton = findViewById(R.id.division);
        multiply = findViewById(R.id.multiply);
        equally = findViewById(R.id.equally);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        four = findViewById(R.id.Four);
        six = findViewById(R.id.six);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        zero = findViewById(R.id.Zero);
        comma = findViewById(R.id.comma);
        numberFiled = findViewById(R.id.numberField);


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "9");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "4");


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "6");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberFiled.setText(numberFiled.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + "3");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               numberFiled.setText(numberFiled.getText() + "0");
            }
        });

        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFiled.setText(numberFiled.getText() + ",");

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberFiled == null){
                    numberFiled.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(numberFiled.getText() + "");
                    crunchifyAddition = true;
                    numberFiled.setText(null);
                }
            }
        });

        divisionButton.setBackgroundColor(Color.RED);
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberFiled.getText() + "");
                crynchifyDivision = true;
                numberFiled.setText(null);
            }
        });
        multiply.setBackgroundColor(Color.RED);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberFiled.getText() + "");
                crunchifyMultiplication = true;
                numberFiled.setText(null);

            }
        });


        minus.setBackgroundColor(Color.RED);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberFiled.getText() + " ");
                mSubtract = true;
                numberFiled.setText(null);

            }
        });


        equally.setBackgroundColor(Color.RED);
        equally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numberFiled.getText() + " ");


                if (crunchifyAddition == true) {
                    numberFiled.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    numberFiled.setText((mValueOne - mValueTwo + " "));
                    mSubtract = false;
                }
                if (crunchifyMultiplication == true ) {
                    numberFiled.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crynchifyDivision == true){
                    numberFiled.setText((mValueOne / mValueTwo + " "));
                    crynchifyDivision = false;
                }
            }
        });

        plus.setBackgroundColor(Color.RED);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}




