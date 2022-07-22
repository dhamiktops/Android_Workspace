package com.example.list1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
{

    ListView listView;
    List<ItemModel> list;





    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        listView = findViewById(R.id.list);
        list = new ArrayList<>();

        list.add(new ItemModel(R.drawable.kgfc2, "Kgf 2","Action Movie","1020cr"));
        list.add(new ItemModel(R.drawable.pushpa, "Pushpa","Full Drama Movie","1050cr"));
        list.add(new ItemModel(R.drawable.rrr, "RRR ","Action and Drama Movie","950cr"));
        list.add(new ItemModel(R.drawable.gangubai, "Gangubai","Comedy Movie","790cr"));
        list.add(new ItemModel(R.drawable.uri, "Uri ","Action Movie","850cr"));
        list.add(new ItemModel(R.drawable.shersha, "Shersha","Lovestory Movie","680cr"));
        list.add(new ItemModel(R.drawable.bhuj, "Bhuj  ","Action and Drama Movie","520cr"));
        list.add(new ItemModel(R.drawable.bahubali2, "Bahubali 2 ","Fully Action Movie","1150cr"));

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), list);
        listView.setAdapter(myAdapter);


    }

}
