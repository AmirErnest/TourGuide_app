package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    private int tColorResourceId;
    Context tContext;
    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations          is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        tColorResourceId = colorResourceId;
        tContext = context;
    }


    /**
     * ViewHolder
     * binds views and fields to a variable
     * no need to use findViewById anymore
     */
    public class ViewHolder {
        @BindView(R.id.default_text_view)
        TextView defaultTextView;
        @BindView(R.id.english_text_view)
        TextView englishTextView;
        @BindView(R.id.image)
        ImageView imageView;
        @BindView(R.id.text_container)
        LinearLayout textContainer;


        private ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final ViewHolder holder;
        // Get the {@link Place} object located at this position in the list
        final Location currentPlace = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        //reuse view if it already exists
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            //inflate new view with custom list_item layout
            convertView = LayoutInflater.from(tContext).inflate(
                    R.layout.list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }



        // Get the name from the currentPlace object and set this text on
        // the name TextView.
        holder.defaultTextView.setText(currentPlace.getDefaultLanguage());


        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        holder.englishTextView.setText(currentPlace.getEnglishLanguage());
        holder.imageView.setImageResource(currentPlace.getImageResourceId());
        holder.textContainer.setBackgroundResource(tColorResourceId);

        return convertView;
    }


}
