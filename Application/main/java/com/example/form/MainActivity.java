package com.example.form;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity
{
    TextView t1, t2, t3, text;
    EditText edt1,edt2;
    CheckBox ch1, ch2, ch3,ch4;
    RadioButton rd1, rd2;
    Button btn1;
    String name, status, status2, A, status3,status4;

TextView textView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        rd1 = findViewById(R.id.rb1);
        rd2 = findViewById(R.id.rb2);
        btn1 = findViewById(R.id.bt1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = edt1.getText().toString();


                if (ch1.isChecked()) {
                    status = "\n  Android  \n";

                }
                if (ch2.isChecked()) {
                    status2 = "\n  Java  \n";

                }
                if (ch3.isChecked()) {
                    status3 = "\n  php  \n";

                }
                if (ch4.isChecked()) {
                    status4 = "\n  ios  \n";

                }


                if (rd1.isChecked()) {
                    A = "\n  MALE  \n";

                }
                if (rd2.isChecked()) {
                    A = "\n  FEMALE  \n";

                }


                StringBuilder sb = new StringBuilder();
                sb.append(name);

                sb.append(status);
                sb.append(status2);
                sb.append(status3);
                sb.append(status4);
                sb.append(A);

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("abc", sb.toString());
                startActivity(i);
            }

        });


    }

            @Override
    public void onBackPressed() {

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Are you sure you want to exit?");
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                finishAffinity();
            }
        });

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert.show();




                }
}

