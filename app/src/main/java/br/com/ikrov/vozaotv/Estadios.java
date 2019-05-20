package br.com.ikrov.vozaotv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Estadios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadios);
    }

    public void clickVoltar(View view) {
        finish();
    }
}
