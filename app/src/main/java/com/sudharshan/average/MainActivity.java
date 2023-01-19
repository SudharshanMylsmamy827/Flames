package com.sudharshan.average;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtNumber1,txtNumber2,txtAverage;
    Button btnAvg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumber1=findViewById(R.id.txtNum1);
        txtNumber2=findViewById(R.id.txtNum2);
        btnAvg=findViewById(R.id.BtnAvg);
        txtAverage=findViewById(R.id.txtAvg);
        btnAvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(txtNumber1.getText().toString());
                double num2=Double.parseDouble(txtNumber2.getText().toString());
                Double avg=(num1 +num2 )/2;

                txtAverage.setText(avg.toString());
            }
        });
    }
}