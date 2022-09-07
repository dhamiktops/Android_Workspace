package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import android.text.TextUtils;


import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class MainActivity17 extends AppCompatActivity {
    EditText edt1, edt2, edt3, edt4, edt5, edt6;
    Button btn1, btn2, btn3;
    RadioButton rb1, rb2;
    FirebaseAuth mAuth;
    String verificationId;
    CountryCodePicker ccp;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        edt6 = findViewById(R.id.edt6);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        ccp = findViewById(R.id.ccp);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        mAuth = FirebaseAuth.getInstance();

//        ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
//            @Override
//            public void onCountrySelected()
//            {
//
//                a = ccp.getSelectedCountryCode();
//                Toast.makeText(MainActivity17.this, "" + a, Toast.LENGTH_SHORT).show();
//            }
//        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(edt5.getText().toString())) {
                    Toast.makeText(MainActivity17.this, "Please enter a valid phone number.", Toast.LENGTH_SHORT).show();
                } else
                {

                    String num = edt5.getText().toString();
                    String num1 = "+" +a+num;
                    Toast.makeText(MainActivity17.this, ""+num1, Toast.LENGTH_SHORT).show();
                    sendverifycode(num1);
                }
            }

            private void sendverifycode(String number) {
                PhoneAuthProvider.getInstance().verifyPhoneNumber(number, 60, TimeUnit.SECONDS, MainActivity17.this, mCallBack);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                verifyCode(edt6.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity17.this, "Inserted", Toast.LENGTH_SHORT).show();
                String name = edt1.getText().toString();
                String surname = edt2.getText().toString();
                String email = edt3.getText().toString();
                String password = edt4.getText().toString();
                String number = edt5.getText().toString();

                String ans="+"+number;

                StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://dharmik838.000webhostapp.com/project/connect/insert.php", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Intent i = new Intent(MainActivity17.this, MainActivity2.class);
                        startActivity(i);

                        Toast.makeText(MainActivity17.this, "Inserted", Toast.LENGTH_SHORT).show();

                    }
                }, new Response.ErrorListener() {
                    @Override

                    public void onErrorResponse(VolleyError error) {


                        Toast.makeText(MainActivity17.this, "Inserted", Toast.LENGTH_SHORT).show();
                    }
                })
                {
                    @Nullable
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap map = new HashMap();
                        map.put("name", name);
                        map.put("surname", surname);
                        map.put("email", email);
                        map.put("password", password);
                        map.put("number", ans);
                        return map;
                    }
                };
                RequestQueue queue = Volley.newRequestQueue(MainActivity17.this);
                queue.add(stringRequest);
           }
        });
    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);

            verificationId = s;
        }
        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential)
        {

            final String code = phoneAuthCredential.getSmsCode();
            if (code != null) {

                edt6.setText(code);

                verifyCode(code);
            }
        }
        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(MainActivity17.this, "Error  " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    };

    private void verifyCode(String code) {
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
        signInWithCredential(credential);

    }

    private void signInWithCredential(PhoneAuthCredential credential) {

        mAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {

                    Toast.makeText(MainActivity17.this, "write", Toast.LENGTH_SHORT).show();

                } else
                {
                    Toast.makeText(MainActivity17.this, "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (rb1.isChecked()) {
                    Toast.makeText(MainActivity17.this, "Male", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (rb2.isChecked()) {
                    Toast.makeText(MainActivity17.this, "Female", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
