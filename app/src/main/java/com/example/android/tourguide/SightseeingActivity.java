package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightseeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an arrayList that take a word object element that show two inputs
        ArrayList<Location> words = new ArrayList<Location>();
        words.add(new Location(getString(R.string.Rathaus_und_Goldener_Saal), getString(R.string.City_Hall_and_Golden_Hall), R.drawable.cityhall));
        words.add(new Location(getString(R.string.Fuggerei), getString(R.string.fuggerei), R.drawable.fuggerei));
        words.add(new Location(getString(R.string.Dom_St__Maria), getString(R.string.The_Cathedral), R.drawable.cathedral));
        words.add(new Location(getString(R.string.Schaezlerpalais), getString(R.string.Schaezler_Palace), R.drawable.schaez_palace));
        words.add(new Location(getString(R.string.Augsburg_Puppenkiste), getString(R.string.Puppet_Theatre), R.drawable.puppen_kiste));
        words.add(new Location(getString(R.string.St__Anna_Kirche_und_Fuggerkapelle), getString(R.string.St__Anna_church), R.drawable.anna_church));
        words.add(new Location(getString(R.string.St__Ulrich_und_Afra), getString(R.string.St__Ulrichs_churches), R.drawable.ulrich_church));
        words.add(new Location(getString(R.string.Perlachturm), getString(R.string.Perlach_Tower), R.drawable.perlach_tower));
        words.add(new Location(getString(R.string.Synagoge), getString(R.string.The_Synagogue), R.drawable.synagogue));
        words.add(new Location(getString(R.string.Fuggerhäuser_Damenhof_Badstuben), getString(R.string.The_Fugger_City_Palace), R.drawable.fugger_palace));


        // use LocationAdapter (instead of array adapter) whose data source is a list of Location (instead of string). The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item layout resource that we created (instead of the simple_list_items_1.xml
        // defined by android framework that takes only one single textView.
        // This list item layout contains 2 TextViews which the adapter will set to
        // display a single sightseeing. (and a photo later)
        //in case we need to find a constructor to pass two lists in an ArrayAdapter, we create a custom class
        //so we show the English and default translation (Location.java)
        LocationAdapter adapter = new LocationAdapter(this, words, R.color.category_sightseeing);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xmle.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        //  ListView will display list items for each sightseeing in the list of sightseeing.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }

}
