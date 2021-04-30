package com.example.app;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6,
            button_7, button_8, button_9, button_plus, button_minus, button_multiply,
            button_split, button_equals, button_del, button_point;
    EditText editTextNumber;

    double mValueOne, mValueTwo;

    boolean operationPlus, operationMinus, operationMultiplication, operationSplit;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_point = findViewById(R.id.button_point);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_del = findViewById(R.id.button_del);
        button_multiply = findViewById(R.id.button_multiply);
        button_equals = findViewById(R.id.button_equals);
        button_split = findViewById(R.id.button_split);
        editTextNumber = findViewById(R.id.editTextNumber);

        button_1.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "1"));
        button_2.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "2"));
        button_3.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "3"));
        button_4.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "4"));
        button_5.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "5"));
        button_6.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "6"));
        button_7.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "7"));
        button_8.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "8"));
        button_9.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "9"));
        button_0.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "0"));
        button_plus.setOnClickListener(v -> {

            if (editTextNumber == null) {
                editTextNumber.setText("");
            } else {
                mValueOne = Float.parseFloat(editTextNumber.getText() + "");
                operationPlus = true;
                editTextNumber.setText(null);
            }
        });

        button_minus.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(editTextNumber.getText() + "");
            operationMinus = true;
            editTextNumber.setText(null);
        });

        button_multiply.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(editTextNumber.getText() + "");
            operationMultiplication = true;
            editTextNumber.setText(null);
        });

        button_split.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(editTextNumber.getText() + "");
            operationSplit = true;
            editTextNumber.setText(null);
        });

        button_equals.setOnClickListener(v -> {
            mValueTwo = Float.parseFloat(editTextNumber.getText() + "");

            if (operationPlus) {
                editTextNumber.setText(mValueOne + mValueTwo + "");
                operationPlus = false;
            }

            if (operationMinus) {
                editTextNumber.setText(mValueOne - mValueTwo + "");
                operationMinus = false;
            }

            if (operationMultiplication) {
                editTextNumber.setText(mValueOne * mValueTwo + "");
                operationMultiplication = false;
            }

            if (operationSplit) {
                editTextNumber.setText(mValueOne / mValueTwo + "");
                operationSplit = false;
            }
        });

        button_del.setOnClickListener(v -> editTextNumber.setText(""));

        button_point.setOnClickListener(v -> editTextNumber.setText(editTextNumber.getText() + "."));
    }
}