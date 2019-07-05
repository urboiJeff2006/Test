package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText1);
        final EditText editTextTwo = (EditText) findViewById(R.id.editText);
        final TextView resultTextView = (TextView) findViewById(R.id.textView);
        Button AddButton = (Button) findViewById(R.id.addButton);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editTextTwo.getText().toString());
                int result = a + b;
                resultTextView.setText("" + result);
            }
        });


        Button SubButton = (Button) findViewById(R.id.subButton);
        SubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editTextTwo.getText().toString());
                int result = a - b;
                resultTextView.setText("" + result);
            }
        });


        Button MulButton = (Button) findViewById(R.id.mulButton);
        MulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText("");
                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editTextTwo.getText().toString());
                int result = a * b;
                resultTextView.setText("" + result);
            }
        });

        Button DivButton = (Button) findViewById(R.id.divButton);
        DivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editTextTwo.getText().toString());
                if (b == 0) {
                    resultTextView.setText("don't be stupid");

                } else {
                    int result = a / b;
                    resultTextView.setText("" + result);
                }



            }
        });


        Button SquareButton = (Button) findViewById(R.id.squareButton);
        SquareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editTextTwo.getText().toString());

                double y = a;
                for(int i = 1;i < b;i++){
                    a =a*y;

                }
                double result = a;
                resultTextView.setText("" + result);



            }
        });




        }
    }

