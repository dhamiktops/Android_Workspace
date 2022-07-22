package com.example.menu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;

import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity3 extends AppCompatActivity {
    TextView txt1;
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        txt1 = findViewById(R.id.txt1);
        bt1 = findViewById(R.id.bt1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(MainActivity3.this, bt1);
                popupMenu.getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.i1:

                                Toast.makeText(MainActivity3.this, "Abcd", Toast.LENGTH_SHORT).show();

                                break;

                        }

                        return false;
                    }
                });

                popupMenu.show();
            }
        });

        registerForContextMenu(txt1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.option, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        switch (item.getItemId())
        {

            case R.id.i1:
                Toast.makeText(MainActivity3.this, "calling", Toast.LENGTH_SHORT).show();

                String num="7202960912";
                Intent i =new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+num));
                startActivity(i);
                break;

            case R.id.i2:
                Intent i2 =new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i2);
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.context,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.i3:
                Toast.makeText(MainActivity3.this, "Position called", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}