package com.example.javacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";


    private EditText valor1, valor2;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);




        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.resultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        });
    }

    private void calcular() {
        String strValor1 = valor1.getText().toString();
        String strValor2 = valor2.getText().toString();
        int decimalCount = countHighDecimal(strValor1, strValor2);

        if (strValor1.isEmpty()) {
            valor1.setError("Ingrese el primer valor");
            return;
        }
        if (strValor2.isEmpty()) {
            valor2.setError("Ingrese el segundo valor");
            return;
        }

        if (!strValor1.matches("-?\\d+(\\.\\d+)?")) {
            valor1.setError("Ingrese un número válido (puede ser negativo)");
            return;
        }
        if (!strValor2.matches("-?\\d+(\\.\\d+)?")) {
            valor2.setError("Ingrese un número válido (puede ser negativo)");
            return;
        }


        double num1, num2;
        try {
            num1 = Double.parseDouble(strValor1);
            num2 = Double.parseDouble(strValor2);
        } catch (NumberFormatException e) {
            resultado.setText("Error: Ingrese valores numéricos válidos.");
            return;
        }

        double res;
        try {
            double resNotRounded = num1 + num2;

            res = roundDecimal(resNotRounded, decimalCount);

        } catch (ArithmeticException e) {
            resultado.setText("Error: Operación no válida.");
            return;
        }

        resultado.setText("Resultado: " + res);
    }

    public static double roundDecimal(double valor, int decimalCount) {
        double factor = Math.pow(10, decimalCount);
        return Math.round(valor * factor) / factor;
    }

    public static int countHighDecimal(String num1, String num2) {
        int decimalesNum1 = countDecimal(num1);
        int decimalesNum2 = countDecimal(num2);

        return Math.max(decimalesNum1, decimalesNum2);
    }

    private static int countDecimal(String valor) {
        int decimalPoint = valor.indexOf('.');

        if (decimalPoint == -1) {
            return 0;
        }

        return valor.length() - decimalPoint - 1;
    }

}