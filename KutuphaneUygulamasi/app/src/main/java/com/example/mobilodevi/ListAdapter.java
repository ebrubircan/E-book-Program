package com.example.mobilodevi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<User>{

    public ListAdapter(Context context,ArrayList<User> userArrayList){

        super(context,R.layout.list_item,userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user= getItem(position);

        if(convertView==null){

            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.kitapResim);
        TextView kitapIsmi = convertView.findViewById(R.id.kitapIsim);
        TextView yazarIsmi = convertView.findViewById(R.id.yazarIsmi);

        imageView.setImageResource(user.imageId);
        kitapIsmi.setText(user.name);
        yazarIsmi.setText(user.author);


        return convertView;
    }
}

