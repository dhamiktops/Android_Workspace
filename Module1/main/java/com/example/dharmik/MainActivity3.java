package com.example.dharmik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {

                                          Intent i = new Intent(MainActivity3.this, MainActivity.class);
                                          startActivity(i);

                                      }
                                  },3000);
    }

}