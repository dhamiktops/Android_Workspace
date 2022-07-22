package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ImageView i1,i2,i3;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialization

        i1=findViewById(R.id.img1);
        i2=findViewById(R.id.img2);
        i3=findViewById(R.id.img3);

        t1=findViewById(R.id.txt2);
        t2=findViewById(R.id.txt3);
        t3=findViewById(R.id.txt4);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, "Welcome to snapchat", Toast.LENGTH_LONG).show();



                String url="https://accounts.snapchat.com/accounts/login?client_id=geo";
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);




            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Welcome to telegram", Toast.LENGTH_SHORT).show();

                String url="https://web.telegram.org/k/";
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Welcome to twitter", Toast.LENGTH_SHORT).show();

                String url="https://twitter.com/i/flow/login";
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //explicit
                Intent i =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);


            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i =new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i);


            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i);


            }
        });



    }
}
