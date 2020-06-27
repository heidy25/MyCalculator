package com.example.mycalculatorapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    Button suma;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.elnumero1);
        resultado = (TextView)findViewById(R.id.txtresultado);
        suma = (Button)findViewById(R.id.btnsumar);

        //funcion CLICK

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double sumatoria = numero1 = 10;
                resultado.setText(Double.toString(sumatoria));
            }
        });
    }
}