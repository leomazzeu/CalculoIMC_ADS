package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularImc(View view) {

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        if(peso <= 0 || altura <= 0) {
            textResultado.setText("Você digitou um valor inválido, digite novamente!");
        }

        double calculo = peso / (altura * altura);

        if (calculo < 16) {
            textResultado.setText("Magreza Grave!");
        } else if (calculo >= 16 && calculo < 17) {
            textResultado.setText("Magreza Leve!");
        } else if (calculo >= 18.5 && calculo < 25) {
            textResultado.setText("Saudável!");
        } else if (calculo >= 25 && calculo < 30) {
            textResultado.setText("Sobrepeso!");
        } else if (calculo >= 30 && calculo < 35) {
            textResultado.setText("Obesidade Grau 1");
        } else if (calculo >= 35 && calculo < 40) {
            textResultado.setText("Obesidade Grau 2");
        } else if (calculo > 40) {
            textResultado.setText("Obesidade Grau IIII (mórbida)");
        }


    }




}