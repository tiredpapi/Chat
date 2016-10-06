package com.tiredpapi.chat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by michal on 06.10.16.
 */

public class FirebaseConfig extends Application {
    public static final String sFIREBASE_URL = "https://chat-9d1e8.firebaseio.com";

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
