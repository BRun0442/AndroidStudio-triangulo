package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    TextView result;
    Button calculate;
    float IMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // shows the content on the screen

        weight = (EditText) findViewById(R.id.ladoA);
        height = (EditText) findViewById(R.id.ladoB);
        calculate = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View view) {
                                             float weightNumber = Float.parseFloat(weight.getText().toString());
                                             float heightNumber = Float.parseFloat(height.getText().toString());

                                             IMC = weightNumber / (heightNumber * heightNumber);
                                             DecimalFormat decimal = new DecimalFormat("#,###.00");
                                             result.setText("Your IMC is: " + decimal.format(IMC));
                                         }
                                     }
        );
    }
}