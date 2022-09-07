package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    private AdapterView<Adapter> lv;
    SharedPreferences sharedPreferences;
    private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sharedPreferences=getSharedPreferences("session", Context.MODE_PRIVATE);

        Toast.makeText(MainActivity2.this, "Welcome "+sharedPreferences.getString("n1","Error"), Toast.LENGTH_SHORT).show();

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("stdio.h");
        list.add("conio.h");
        list.add("string.h");
        list.add("stdlib.h");
        list.add("math.h");
        list.add("time.h");
        list.add("ctype.h");
        list.add("stdarg.h");
        list.add("signal.h");
        list.add("setjmp.h");
        list.add("locale.h");
        list.add("errno.h");
        list.add("assert.h");
        list.add("stdio.h");
        list.add("conio.h");
        list.add("string.h");
        list.add("stdlib.h");
        list.add("math.h");
        list.add("time.h");
        list.add("ctype.h");
        list.add("stdarg.h");
        list.add("signal.h");
        list.add("setjmp.h");
        list.add("locale.h");
        list.add("errno.h");
        list.add("assert.h");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                Toast.makeText(MainActivity2.this, "position" + i, Toast.LENGTH_SHORT).show();
                if (i == 0) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdio.h", Toast.LENGTH_SHORT).show();
                } else if (i == 1) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "conio.h", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "string.h", Toast.LENGTH_SHORT).show();
                } else if (i == 3) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdlib.h", Toast.LENGTH_SHORT).show();
                } else if (i == 4) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "math.h", Toast.LENGTH_SHORT).show();
                } else if (i == 5) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "time.h", Toast.LENGTH_SHORT).show();
                } else if (i == 6) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity9.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "ctype.h", Toast.LENGTH_SHORT).show();
                } else if (i == 7) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity10.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdarg.h", Toast.LENGTH_SHORT).show();
                } else if (i == 8) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity11.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "signal.h", Toast.LENGTH_SHORT).show();
                } else if (i == 9) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity12.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "setjmp.h", Toast.LENGTH_SHORT).show();
                } else if (i == 10) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity13.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "locale.h", Toast.LENGTH_SHORT).show();
                } else if (i == 11) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity14.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "errno.h", Toast.LENGTH_SHORT).show();
                } else if (i == 12) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity15.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "assert.h", Toast.LENGTH_SHORT).show();
                } else if (i == 13) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdio.h", Toast.LENGTH_SHORT).show();
                } else if (i == 14) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "conio.h", Toast.LENGTH_SHORT).show();
                } else if (i == 15) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "string.h", Toast.LENGTH_SHORT).show();
                } else if (i == 16) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdlib.h", Toast.LENGTH_SHORT).show();
                } else if (i == 17) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "math.h", Toast.LENGTH_SHORT).show();
                } else if (i == 18) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "time.h", Toast.LENGTH_SHORT).show();
                } else if (i == 19) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity9.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "ctype.h", Toast.LENGTH_SHORT).show();
                } else if (i == 20) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity10.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "stdarg.h", Toast.LENGTH_SHORT).show();
                } else if (i == 21) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity11.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "signal.h", Toast.LENGTH_SHORT).show();
                } else if (i == 22) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity12.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "setjmp.h", Toast.LENGTH_SHORT).show();
                } else if (i == 23) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity13.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "locale.h", Toast.LENGTH_SHORT).show();
                } else if (i == 24) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity14.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "errno.h", Toast.LENGTH_SHORT).show();
                } else if (i == 25) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity15.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "assert.h", Toast.LENGTH_SHORT).show();
                }
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(MainActivity2.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            getMenuInflater().inflate(R.menu.option,menu);

            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item)
        {

            switch (item.getItemId())
            {

                case R.id.t1:

                    Intent i =new Intent(MainActivity2.this,MainActivity16.class);
                    startActivity(i);
                    break;

                case R.id.t2:
                    finishAffinity();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    }


