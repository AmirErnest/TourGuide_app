package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an arrayList that take a word object element that show two inputs
        ArrayList<Location> words = new ArrayList<Location>();
        words.add(new Location(getString(R.string.Hotel_Garni_Am_Rathaus),  R.drawable.bed));
        words.add(new Location(getString(R.string.Übernacht_Hostel),  R.drawable.bed));
        words.add(new Location(getString(R.string.Hotel_Augusta),  R.drawable.bed));
        words.add(new Location(getString(R.string.Stadthotel_Augsburg),  R.drawable.bed));
        words.add(new Location(getString(R.string.Hotel_Garni_Jakoberhof),  R.drawable.bed));
        words.add(new Location(getString(R.string.InterCityHotel_Augsburg),  R.drawable.bed));
        words.add(new Location(getString(R.string.Hotel_Riegele),  R.drawable.bed));
        words.add(new Location(getString(R.string.Ibis_Augsburg_Königsplatz),  R.drawable.bed));
        words.add(new Location(getString(R.string.Dorint_Hotel_Augsburg_an_der_Kongresshalle), R.drawable.bed));


        // use LocationAdapter (instead of array adapter) whose data source is a list of Location (instead of string). The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item layout resource that we created (instead of the simple_list_items_1.xml
        // defined by android framework that takes only one single textView.
        // This list item layout contains 2 TextViews which the adapter will set to
        // display a single sightseeing. (and a photo later)
        //in case we need to find a constructor to pass two lists in an ArrayAdapter, we create a custom class
        //so we show the English and default translation (Location.java)
        LocationAdapter adapter = new LocationAdapter(this, words, R.color.category_hotels);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        //  ListView will display list items for each sightseeing in the list of sightseeing.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }

}
