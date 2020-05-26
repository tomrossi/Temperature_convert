package com.example.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tempCelsius;
    TextView tempFar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempCelsius = (EditText) findViewById(R.id.editText);
        tempFar = (TextView) findViewById(R.id.textConv);

    }


    public void Converti(View view) {
        //controllo del click utente
        Log.d("convTag","click button convert");
        String celsius = tempCelsius.getText().toString();
        if(!TextUtils.isEmpty(celsius)){
            if(TextUtils.isDigitsOnly(celsius)){
                Log.d("Converti","Il valore inserito è: "+celsius);
                //formula conversione
                double tempC = Double.parseDouble(celsius);
                double tempF = tempC * 1.8 + 32;
                //scrivere valore tempF nella textView
                tempFar.setText(Double.toString(tempF));
            }else{
                Toast popup=Toast.makeText(getApplicationContext(),"Devi inserire cifre numeriche",Toast.LENGTH_LONG);
                popup.show();
            }
        }else{
            Toast popup=Toast.makeText(getApplicationContext(),"Campo di input vuoto",Toast.LENGTH_LONG);
            popup.show();
        }

    }







}
