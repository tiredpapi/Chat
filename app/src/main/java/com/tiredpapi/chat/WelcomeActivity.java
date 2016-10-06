package com.tiredpapi.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    AndroidID androidID;

    TextView textAndroidID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textAndroidID = (TextView) findViewById(R.id.textAndroidID);
        androidID = new AndroidID(this);

        textAndroidID.setText(androidID.getAndroidID());
    }
}
