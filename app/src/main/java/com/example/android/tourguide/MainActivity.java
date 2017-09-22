package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //find the view that shows the Sightseeing activity
        TextView sightseeing = (TextView) findViewById(R.id.Sightseeing);

        //set an onClickListener on that view
        sightseeing.setOnClickListener(new OnClickListener() {
            //the code in this method will be executed when the sightseeing category is clicked on.
            @Override
            public void onClick(View view) {
                // create a new Intent to open the sightseeingActivity
                Intent sightseeingIntent = new Intent(MainActivity.this, SightseeingActivity.class);

                // start that activity
                startActivity(sightseeingIntent);
            }
        });

        // find the view that shows the Hotels activity
        TextView hotels = (TextView) findViewById(R.id.Hotels);

        //set onClickListener on that view
        hotels.setOnClickListener(new OnClickListener() {
            //the code in this method will be executed when the hotels category is clicked on.
            @Override
            public void onClick(View view) {
                // create a new Intent to open the hotelsActivity
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                //start that activity
                startActivity(hotelsIntent);
            }
        });

        // find the view that shows the restaurants activity
        TextView restaurants = (TextView) findViewById(R.id.Restaurants);

        // set onClickListener on that view
        restaurants.setOnClickListener(new OnClickListener() {
            // the code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // start this activity
                startActivity(restaurantsIntent);
            }
        });

        // find the view that shows the camping activity
        TextView camping = (TextView) findViewById(R.id.Camping);

        // set onClickListener on that view
        camping.setOnClickListener(new OnClickListener() {
            // the code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                Intent campingIntent = new Intent(MainActivity.this, CampingActivity.class);

                // start this activity
                startActivity(campingIntent);
            }
        });


    }
}
