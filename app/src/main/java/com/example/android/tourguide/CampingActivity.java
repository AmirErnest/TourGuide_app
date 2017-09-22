package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CampingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an arrayList that take a word object element that show two inputs
        ArrayList<Location> words = new ArrayList<Location>();
        words.add(new Location(getString(R.string.Wohnmobilstellplatz_Wertach), getString(R.string.Camping_pitch_Wertach), R.drawable.camping));
        words.add(new Location(getString(R.string.Lech_Camping_GmbH), getString(R.string.Lech_Camping_gmbH), R.drawable.camping));
        words.add(new Location(getString(R.string.Campingplatz_Bella_Augusta), getString(R.string.Camping_site_Bella_Augusta), R.drawable.camping));
        words.add(new Location(getString(R.string.Campingplatz_Ludwigshof_am_See), getString(R.string.Camping_site_Ludwigshof_am_See), R.drawable.camping));


        // use LocationAdapter (instead of array adapter) whose data source is a list of Location (instead of string). The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item layout resource that we created (instead of the simple_list_items_1.xml
        // defined by android framework that takes only one single textView.
        // This list item layout contains 2 TextViews which the adapter will set to
        // display a single sightseeing. (and a photo later)
        //in case we need to find a constructor to pass two lists in an ArrayAdapter, we create a custom class
        //so we show the English and default translation (Location.java)
        LocationAdapter adapter = new LocationAdapter(this, words, R.color.category_camping);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        //  ListView will display list items for each sightseeing in the list of sightseeing.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }

}
