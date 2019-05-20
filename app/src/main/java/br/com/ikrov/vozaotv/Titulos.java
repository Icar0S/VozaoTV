package br.com.ikrov.vozaotv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Titulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titulos);
    }

    public void clickVoltar(View view) {
        finish();
    }
}
