package br.edu.ifsc.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        EditText altura =(EditText) findViewById(R.id.editText);
        EditText peso =(EditText) findViewById(R.id.editText2);
        TextView resu =(TextView) findViewById(R.id.textView2);
        double imc = Integer.parseInt(peso.getText().toString()) /(Integer.parseInt(altura.getText().toString())*Integer.parseInt(altura.getText().toString()));

       if(imc<16){

           resu.setText("magreza grave");
       }
       if(imc >=16 || imc <17){
           resu.setText("magreza moderada");
       }
       if(imc >=17 || imc < 18.5){
           resu.setText("magreza leve");
       }
       if(imc >=18.5 || imc <25){
           resu.setText("Saudavel");
       }
       if(imc >=25 || imc <30){
           resu.setText("sobrepeso");
       }
        if(imc >=30 || imc <35){
            resu.setText("obesidade 1");
        }
        if(imc >=35 || imc <40){
            resu.setText("obesidade 2");
        }
        if(imc>= 40){
            resu.setText("obesidade 3");
        }


    }
}
