package com.example.pijus.chemijosprojektas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balzamas2 extends AppCompatActivity {
    Button voniaskaiciuoti;
    EditText pirmasvonia;
    EditText antrasvonia;
    EditText treciasvonia;
    EditText ketvirtasvonia;
    TextView atsakymas;
    double alyvos=23;
    double vaskas=17;
    double medus=6;
    double vandekas =0.05;
    int klintas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balzamas2);
        voniaskaiciuoti=(Button)findViewById(R.id.buttonba3);
        pirmasvonia=(EditText)findViewById(R.id.ivestisba1);
        antrasvonia=(EditText)findViewById(R.id.ivestisba2);
        treciasvonia=(EditText)findViewById(R.id.ivestisba3);
        ketvirtasvonia=(EditText)findViewById(R.id.ivestisba4);
        atsakymas=(TextView)findViewById(R.id.textViewba2);
        voniaskaiciuoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atsakymas.setText("");
                if(pirmasvonia.getText().toString().isEmpty()||antrasvonia.getText().toString().isEmpty()||treciasvonia.getText().toString().isEmpty()|ketvirtasvonia.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Prašome užpildyti visus langelius",1000).show();

                }
                else {
                    double vanduo1 = Double.parseDouble(pirmasvonia.getText().toString());
                    double vanduo2 = Double.parseDouble(antrasvonia.getText().toString());
                    double vanduo3 = Double.parseDouble(treciasvonia.getText().toString());
                    double vanduo4 = Double.parseDouble(ketvirtasvonia.getText().toString());
                    double min = 100000;

                    if (min > vanduo1/alyvos) {
                        min = vanduo1/alyvos;
                    }
                    if (min > vanduo2/vaskas) {
                        min = vanduo2/vaskas;
                    }
                    if (min > vanduo3/medus) {
                        min = vanduo3/medus;
                    }
                    if (min > vanduo4/vandekas) {
                        min = vanduo4/vandekas;
                    }
                    atsakymas.setText(String.valueOf(String.format("%.2f",min)) + "porcijų");

                }
            }
        });
    }
}
