package com.example.experiment6ccustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter {
    private String[] fruitNames;
    private Integer[] imageid;
    private Context context;
    private static LayoutInflater inflater = null;

    public CustomArrayAdapter(Context context, String[] fruitNames, Integer[] imageid) {
        super(context, R.layout.list_view, fruitNames);
        this.context = context;
        this.fruitNames = fruitNames;
        this.imageid = imageid;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.list_view, parent, false);

        TextView textViewFruit = (TextView) vi.findViewById(R.id.textViewFruit);
        ImageView imageViewFruit = (ImageView) vi.findViewById(R.id.imageViewFruit);

        textViewFruit.setText(fruitNames[position]);
//        imageViewFruit.setImageResource(imageid[position]);
        return vi;
    }


}

