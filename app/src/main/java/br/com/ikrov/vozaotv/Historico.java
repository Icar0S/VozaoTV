package br.com.ikrov.vozaotv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Historico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
    }

    public void clickVoltar(View view) {
        finish();
    }
}
