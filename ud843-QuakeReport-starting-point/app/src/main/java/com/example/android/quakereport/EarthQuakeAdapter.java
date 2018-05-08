package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {

    public EarthQuakeAdapter(Activity context, ArrayList<EarthQuake> earthQuakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, earthQuakes);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link EarthQuake} object located at this position in the list
        EarthQuake currentEarthQuake = getItem(position);

        // Find the TextView in the list_item.xml layout with the Magnitude
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        // Set the magnitude to the Textview
        nameTextView.setText(currentEarthQuake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the City name
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        // Set the City name to the TextView
        numberTextView.setText(currentEarthQuake.getCity());

        // Find the ImageView in the list_item.xml layout with the Date of the EarthQuake
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Set the Date of the Earthquake to the Textview
        iconView.setImageResource(currentEarthQuake.getDate());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
