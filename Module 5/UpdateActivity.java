package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateActivity extends AppCompatActivity {

    String id, name, desc, price, quantity;
    EditText nameText, descText, priceText, quantityText;
    Button updateButton;
    Apiinterface api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        id = String.valueOf(getIntent().getIntExtra("id",0));
        name = getIntent().getStringExtra("name");
        desc = getIntent().getStringExtra("desc");
        price = getIntent().getStringExtra("price");

        nameText = findViewById(R.id.edtname);
        descText = findViewById(R.id.edtdescription);
        priceText = findViewById(R.id.edtprice);

        updateButton = findViewById(R.id.btn1);

        nameText.setText(name);
        descText.setText(desc);

        priceText.setText(price);


        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                api = ApiClient.getretrofit().create(Apiinterface.class);
                Call<Model> call= api.updatedetail(
                        id,
                        nameText.getText().toString(),
                        priceText.getText().toString(),
                        descText.getText().toString());

                call.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {

                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {

                    }
                });
                startActivity(new Intent(UpdateActivity.this,MainActivity2.class));
            }
        });

    }
}