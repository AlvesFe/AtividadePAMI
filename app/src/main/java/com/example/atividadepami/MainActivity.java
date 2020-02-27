package com.example.atividadepami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular (View v){

        //CRIANDO OBJETOS
        final EditText txtbNum1 = findViewById(R.id.txtbNum1);
        final EditText txtbNum2 = findViewById(R.id.txtbNum2);
        final TextView txtResult = findViewById(R.id.txtResult);
        Button btnCalc = findViewById(R.id.btnCalc);

        //EXECUÇÂO DO CALCULO
        double num1 = Double.parseDouble(txtbNum1.getText().toString());
        double num2 = Double.parseDouble(txtbNum2.getText().toString());

        //EXIBIÇÂO DO RESULTADO
        txtResult.setText(String.valueOf(num1+num2));
    }

}