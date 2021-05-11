package com.example.exe9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_euros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_euros=findViewById(R.id.et_valorEuros);
    }
    public void euroParaKwanza(View view){
        double vEuro = Double.parseDouble(et_euros.getText().toString());
        double vKwanza=vEuro * 785.14;
        Toast.makeText(MainActivity.this,vEuro + "€ são "+ vKwanza +"KZs",Toast.LENGTH_SHORT).show();
    }
    public void euroParaReais(View view){
        double vEuro = Double.parseDouble(et_euros.getText().toString());
        double vReais=vEuro * 6.4;
        Toast.makeText(MainActivity.this,vEuro + "€ são "+ vReais +"R$ ",Toast.LENGTH_SHORT).show();
    }
    public void euroParaDolar(View view){
        double vEuro = Double.parseDouble(et_euros.getText().toString());
        double vDolar=vEuro * 1.20;
        Toast.makeText(MainActivity.this,vEuro + "€ são "+ vDolar +"$",Toast.LENGTH_SHORT).show();
    }
}