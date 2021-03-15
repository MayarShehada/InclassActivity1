package com.birzeit.inclassactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtHeight;
    private EditText edtWidth;
    private EditText edtBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHeight = findViewById(R.id.edtHeight);
        edtWidth = findViewById(R.id.edtWidth);
        edtBMI = findViewById(R.id.edtBMI);
    }

    public void btnEnter_onClick(View view) {

        double weight = Double.parseDouble(edtWidth.getText().toString());
        double height = Double.parseDouble(edtHeight.getText().toString());

        double bmiNum = (weight)/(height*height);

        if(bmiNum < 18.5) {
            edtBMI.setText(Math.floor(bmiNum * 100) / 100 + " : " +"Under weight ");
        }
        if(bmiNum > 18.5 && bmiNum < 24.9) {
            edtBMI.setText(Math.floor(bmiNum * 100) / 100 + " : " +" Normal");
        }
        if(bmiNum > 25 && bmiNum < 29.9) {
            edtBMI.setText(Math.floor(bmiNum * 100) / 100 + " : " +" Overweight ");
        }
        if(bmiNum >= 30) {
            edtBMI.setText(Math.floor(bmiNum * 100) / 100 + " : " +" Obesity");
        }
    }
}