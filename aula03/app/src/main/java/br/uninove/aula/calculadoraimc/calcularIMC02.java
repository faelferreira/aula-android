package br.uninove.aula.calculadoraimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class calcularIMC02 extends AppCompatActivity {
    private  double peso =0.0;
    private  double altura = 0.0;
    private int genero = 0;
    private double imc =0.0;
    private TextView txtMensagem;
    private  String mensagem ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc02);
        txtMensagem = (TextView) findViewById(R.id.txtMensagem);
        Intent it = this.getIntent();
        this.peso = it.getDoubleExtra("peso", 0.0);
        this.altura = it.getDoubleExtra("altura", 0.0);
        this.genero = it.getIntExtra("genero", 0);

        calcularIMC02();
    }


    public void calcularIMC02(){
        this.imc = (this.altura * this.altura) / this.peso;
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
        txtMensagem.setText(this.mensagem);
    }

}
