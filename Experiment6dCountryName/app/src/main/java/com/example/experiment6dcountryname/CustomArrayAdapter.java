package com.example.experiment6dcountryname;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter {
    private String[] countryNames;
    private Integer[] imageid;
    private String[] currencyNames;
    private Context context;
    private static LayoutInflater inflater = null;

    public CustomArrayAdapter(Context context, String[] countryNames, String[] currencyNames,  Integer[] imageid) {
        super(context, R.layout.list_view, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.currencyNames = currencyNames;
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

        TextView textViewCountry = (TextView) vi.findViewById(R.id.textViewCountry);
        TextView textViewCurrency = (TextView) vi.findViewById(R.id.textViewCurrency);
        ImageView imageViewFruit = (ImageView) vi.findViewById(R.id.imageViewFlag);

        textViewCountry.setText(countryNames[position]);
        textViewCurrency.setText(currencyNames[position]);
        imageViewFruit.setImageResource(imageid[position]);
        return vi;
    }
}