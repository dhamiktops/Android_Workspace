package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.option_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        switch (item.getItemId())
        {

            case R.id.itm1:

                Intent i =new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(item);
                break;

            case R.id.itm1:
                finishAffinity();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}