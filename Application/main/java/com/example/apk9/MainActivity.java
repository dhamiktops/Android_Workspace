package com.example.apk9;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding tops;
    Spinner spinner;
    String city[]={"Rajkot","surat","baroda"};
    private Object ArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spin);
        tops = ActivityMainBinding.inflate(getLayoutInflater());

        View view = tops.getRoot();
        setContentView(view);

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, city);
        final AlertDialog.Builder builder = tops.spin.setAdapter(ArrayAdapter);

        tops.spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(MainActivity.this, ""+city[i], Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}