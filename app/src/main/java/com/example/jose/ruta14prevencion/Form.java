package com.example.jose.ruta14prevencion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by JoseMaria on 11/20/14.
 */

public class Form extends Activity{
    private Spinner spinner;
    private ArrayAdapter adapter;
    private Double latitud, longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        adapter = ArrayAdapter.createFromResource(this,
                R.array.accident_type_list, android.R.layout.simple_spinner_item);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        Intent intent = getIntent();
        latitud = intent.getDoubleExtra("latitud", 0);
        longitud = intent.getDoubleExtra("longitud", 0);
    }

    public void SendInfo(View view) {
        //TODO make an HTTP request and send info somehow and somewhere...
    }

}
