package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText ladoA, ladoB, ladoC;
    Button calculate;
    TextView result;

    float a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoA = (EditText) findViewById(R.id.ladoA);
        ladoB = (EditText) findViewById(R.id.ladoB);
        ladoC = (EditText) findViewById(R.id.ladoC);

        calculate = (Button) findViewById(R.id.button);

        result = (TextView) findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(ladoA.getText().toString());
                b = Float.parseFloat(ladoB.getText().toString());
                c = Float.parseFloat(ladoC.getText().toString());

                if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
                    if ( a == b && b == c){
                        result.setText("É um triângulo Equilátero");
                    }

                    else if( a == b || a == c || c == b){
                        result.setText("É um triângulo Isósceles");
                    }

                    else{
                        result.setText("É um triângulo Escaleno");
                    }

                }else{
                    result.setText("Não é um triângulo");
                }

            }
        });

    }

}