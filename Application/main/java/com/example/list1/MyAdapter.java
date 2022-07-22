
package com.example.list1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter


{
    Context context;
    List<ItemModel>list;

    MyAdapter(Context context, List<ItemModel> list)
    {
        this.context=context;
        this.list=list;

    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int i)
    {
        return list.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater in=LayoutInflater.from(context);
        view=in.inflate(R.layout.design,viewGroup,false);

        ImageView img=view.findViewById(R.id.img);
        TextView txt=view.findViewById(R.id.txt1);
        TextView txt2=view.findViewById(R.id.txt2);
        TextView txt3=view.findViewById(R.id.txt3);


        img.setImageResource(list.get(i).image);
        txt.setText(list.get(i).text);
        txt2.setText(list.get(i).txt2);
        txt3.setText(list.get(i).txt3);





        return view;
    }
}
