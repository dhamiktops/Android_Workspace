package com.example.myapplication;

import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission_group.CAMERA;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.HashMap;
import java.util.Map;

public class MainActivity18 extends AppCompatActivity
{
    EditText edt7, edt8;
    Button btn4, btn5;
    SharedPreferences sharedPreferences;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        edt7 = findViewById(R.id.edt7);
        edt8 = findViewById(R.id.edt8);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        sharedPreferences=getSharedPreferences("session", Context.MODE_PRIVATE);

        if(!(checkSelfPermission(CALL_PHONE) == PackageManager.PERMISSION_GRANTED) && !(checkSelfPermission(CAMERA) == PackageManager.PERMISSION_GRANTED))
        {
            requestPermissions(new String[]{CALL_PHONE,CAMERA},100);
        }
        if(sharedPreferences.getBoolean("session",false) && !sharedPreferences.getString("n1","").isEmpty())
        {
            Intent i =new Intent(MainActivity18.this,MainActivity2.class);
            startActivity(i);


        }
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String name = edt7.getText().toString();
                String pass = edt8.getText().toString();

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("n1",name);
                editor.putString("p1",pass);
                editor.putBoolean("session",true);

                editor.apply();
                editor.commit();
                Intent i =new Intent(MainActivity18.this,MainActivity2.class);
                startActivity(i);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://dharmik838.000webhostapp.com/project/connect/login.php", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {
                        if (response.trim().equals("0")) {
                            Toast.makeText(MainActivity18.this, "fail", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent i = new Intent(MainActivity18.this, MainActivity2.class);
                            startActivity(i);
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
//                        Toast.makeText(MainActivity18.this, "error", Toast.LENGTH_SHORT).show();
                    }
                }) {
                    @Nullable
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap map = new HashMap();
                        map.put("name", name);
                        map.put("password", pass);
                        return map;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity18.this);
                requestQueue.add(stringRequest);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Toast.makeText(MainActivity18.this, "Registration", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity18.this, MainActivity17.class);
            startActivity(i);
        }
    });
    }
}
