package com.example.a3rd_sem;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsAdapter extends ArrayAdapter<String> {

    Activity context;
    String [] title;
    String[] description;
    int [] image;

    public ItemsAdapter(Context context, String[] title, String[] description, int[] image) {
        super(context, resource);
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }



    public View getView (int position , View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
         View view1=inflater.inflate(R.layout.custom_list,null,true);
        TextView txTitle=view1.findViewById(R.id.title);
        TextView txDescription=view1.findViewById(R.id.description);
        ImageView imageView=view1.findViewById(R.id.image1);

        txTitle.setText(title[position]);
        txDescription.setText(description[position]);
        imageView.setImageResource(image[position]);
        return view1;
    }
}
