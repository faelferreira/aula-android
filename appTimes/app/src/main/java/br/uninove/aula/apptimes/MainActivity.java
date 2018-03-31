package br.uninove.aula.apptimes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void palmeira(View view){
        Intent palmeiras = new Intent(MainActivity.this, PalmeirasActivity.class);
            startActivity(palmeiras);
    }
    public void saoPaulo(View view){
        Intent sappaulo = new Intent(MainActivity.this,saoPauloActivity.class);
        startActivity(sappaulo);
    }
    public void gaivotas(View view){
        Intent gaivota = new Intent(MainActivity.this, GaivotasActivity.class);
        startActivity(gaivota);
    }
    public void peixes(View view){
        Intent peixe = new Intent(MainActivity.this, peixesActivity.class);
    }
}
