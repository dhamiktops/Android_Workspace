package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.callback.Callback;

import okhttp3.Response;

public class MainActivity extends AppCompatActivity
{
    EditText edt1,edt2,edt3;
    Button btn1;
    Apiinterface apiinterface;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=findViewById(R.id.edtname);
        edt2=findViewById(R.id.edtprice);
        edt3=findViewById(R.id.edtdescription);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=edt1.getText().toString();
                String price=edt2.getText().toString();
                String des=edt3.getText().toString();

                apiinterface=ApiClient.getretrofit().create(Apiinterface.class);

                Call<Model> call= apiinterface.savedetail(name,price,des);
                call.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {

                        Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {

                        Toast.makeText(MainActivity.this, "No Internet", Toast.LENGTH_SHORT).show();

                    }
                });
                Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

    }
}