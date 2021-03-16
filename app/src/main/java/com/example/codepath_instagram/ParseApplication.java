package com.example.codepath_instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes the Parse SDK as soon as the app is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tOt2IcbhvOfYT3zyytlTsbfJD1hX1RWPSUXbFziI")
                .clientKey("mr570ugbbzDOYdEGBrtJoh9dtvRBO4rPWhudrSmY")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
