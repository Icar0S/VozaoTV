package br.com.ikrov.vozaotv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickUni(View view) {
        tela = new Intent(getApplicationContext(), UniformeOficial.class);
        startActivity(tela);
    }

    public void clickHist(View view) {
        tela = new Intent(getApplicationContext(), Historico.class);
        startActivity(tela);
    }

    public void clickTitulos(View view) {
        tela = new Intent(getApplicationContext(), Titulos.class);
        startActivity(tela);
    }

    public void clickIdolos(View view) {
        tela = new Intent(getApplicationContext(), Idolos.class);
        startActivity(tela);
    }

    public void clickTorcida(View view) {
        tela = new Intent(getApplicationContext(), Torcida.class);
        startActivity(tela);
    }

    public void clickEstadio(View view) {
        tela = new Intent(getApplicationContext(), Estadios.class);
        startActivity(tela);
    }

    public void clickEscudos(View view) {
        tela = new Intent(getApplicationContext(), Escudos.class);
        startActivity(tela);
    }
}
