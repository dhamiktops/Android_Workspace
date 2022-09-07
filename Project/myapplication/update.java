package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;

import java.io.StringReader;

public class update extends AppCompatActivity
{
    EditText edt1,edt2,edt3,edt4;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        edt4=findViewById(R.id.edt4);
        btn1=findViewById(R.id.btn1);

//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name=edt1.getText().toString();
//                String surname=edt2.getText().toString();
//                String email=edt3.getText().toString();
//                String password=edt4.getText().toString();
//
//
//                StringReader stringReader=new StringReader(Request.Method.POST,"",new )
//
//            }
//        });



    }
}