package com.example.android.tourguide;

/**
 * Created by Amirkher on 27.08.2017.
 */

/**
 * word represents two words/sentences that would be displayed in list_item
 */

public class Location {


    /* default tour guide list_item language */
    private String tDefaultLanguage;

    /*english tour guide list_item language */
    private String tEnglishLanguage;

    /*Image Resource ID for the word */
    private int tImageResourceId;



        /*
   constructor for a word object that takes default language, english language and an image
     */

    public Location(String tDefaultLanguage, String tEnglishLanguage, int tImageResourceId) {
        this.tDefaultLanguage = tDefaultLanguage;
        this.tEnglishLanguage = tEnglishLanguage;
        this.tImageResourceId = tImageResourceId;
    }

    /*
constructor for a word object that takes default language and an image
*/
    public Location(String tDefaultLanguage,  int tImageResourceId) {
        this.tDefaultLanguage = tDefaultLanguage;
        this.tImageResourceId = tImageResourceId;
    }


    /* get the default translation of the app
     */
    public String getDefaultLanguage() {
        return tDefaultLanguage;
    }

    /* get the english translation
         */
    public String getEnglishLanguage() {
        return tEnglishLanguage;
    }

    /* return the image resource id of the word
     */
    public int getImageResourceId() {
        return tImageResourceId;
    }



}