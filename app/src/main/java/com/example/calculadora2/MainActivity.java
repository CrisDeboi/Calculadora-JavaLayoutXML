package com.example.calculadora2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_main);

        TextView resultado = findViewById(R.id.resultado);
        TextView error = findViewById(R.id.textView);
        TextInputEditText num1 = findViewById(R.id.num1);
        TextInputEditText num2 = findViewById(R.id.num2);
        Button sumador = findViewById(R.id.myButton);


        sumador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
                    error.setText("Ingrese dos números válidos");
                }else{
                    error.setText("");
                    int numero1 = Integer.parseInt(num1.getText().toString());
                    int numero2 = Integer.parseInt(num2.getText().toString());
                    int numResultado= numero1+numero2;
                    resultado.setText(String.valueOf(numResultado));
                }
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}