package br.uninove.aula.calculadoraimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton rdbMasculino;
    private RadioButton rdbFeminino;
    private EditText txtPeso, txtAltura;
    private TextView lblResultado;
    private double imc =0.0;
    private  double peso =0.0;
    private  double altura = 0.0;
    private int genero = 0;
    private  String mensagem ="";

    public MainActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPeso = (EditText)findViewById(R.id.txtPeso);
        txtAltura = (EditText)findViewById(R.id.txtAltura);
        rdbFeminino = (RadioButton)findViewById(R.id.rdbFeminino);
        rdbMasculino = (RadioButton)findViewById(R.id.rdbMasculino);
        //lblResultado = (TextView)findViewById(R.id.lblResultado);
    }
    public void calcular(View view){
        this.altura =  Double.parseDouble(txtAltura.getText().toString());
        this.peso = Double.parseDouble(txtPeso.getText().toString());
        this.imc = (this.altura * this.altura) / this.peso;
        if(rdbMasculino.isChecked()){
            this.genero = 1;
        }else if(rdbFeminino.isChecked()){
            this.genero = 2;
        }
        switch(this.genero){
            case 1 :
                if(this.imc < 20){
                    this.mensagem = "Abaixo do peso";
                }else if(this.imc < 25){
                    this.mensagem = "Normal";
                }else if(this.imc < 30){
                    this.mensagem = "Obesidade Leve";
                }else if(this.imc <40){
                    this.mensagem = "Obesidade Moderada";
                }else {
                    this.mensagem = "Obesidae Morbida";
                }
                break;
            case 2:
                if(this.imc < 19){
                    this.mensagem = "Abaixo do peso";
                }else if(this.imc < 24){
                    this.mensagem = "Normal";
                }else if(this.imc < 39){
                    this.mensagem = "Obesidade Leve";
                }else if(this.imc <39){
                    this.mensagem = "Obesidade Moderada";
                }else {
                    this.mensagem = "Obesidae Morbida";
                }
                break;
        }
       // lblResultado.setText(this.mensagem);
    }

    public void calcularIMC(View view){
        Intent it = new Intent(this,calcularIMC02.class);
        this.altura = Double.parseDouble(txtAltura.getText().toString());
        this.peso = Double.parseDouble(txtPeso.getText().toString());
        if(rdbMasculino.isChecked()){
            this.genero = 1;
        }else if(rdbFeminino.isChecked()){
            this.genero = 2;
        }
        it.putExtra("genero",this.genero);
        it.putExtra("peso",this.peso);
        it.putExtra("altura",this.altura);
        startActivity(it);
    }
}
