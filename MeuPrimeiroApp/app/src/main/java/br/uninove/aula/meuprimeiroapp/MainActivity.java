package br.uninove.aula.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtNum1;
    public EditText txtNum2;
    public TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtNum1=(EditText)findViewById(R.id.txtNum1);
        this.txtNum2=(EditText)findViewById(R.id.txtNum2);
        this.txtResultado=(TextView)findViewById(R.id.txtResultado);
    }
    public void somar(View view){
        double n1 = Double.parseDouble(txtNum1.getText().toString());
        double n2 = Double.parseDouble(txtNum2.getText().toString());
        double result = n1 + n2;
        txtResultado.setText(String.valueOf(result));
    }
}
