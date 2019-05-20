package br.com.ikrov.vozaotv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Idolos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idolos);
    }

    public void clickVoltar(View view) {
        finish();
    }
}
