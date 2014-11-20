package com.example.jose.ruta14prevencion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by JoseMaria on 11/20/14.
 */

public class Form extends Activity{
    Spinner spinner;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        adapter = ArrayAdapter.createFromResource(this,
                R.array.accident_type_list, android.R.layout.simple_spinner_item);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
    }

}
