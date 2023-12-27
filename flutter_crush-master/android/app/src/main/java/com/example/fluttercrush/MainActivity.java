package com.example.fluttercrush;

import android.os.Bundle;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterFragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);

        // Ensure FlutterFragment is attached to the activity
        FlutterFragment flutterFragment = FlutterFragment.createDefault();
        getSupportFragmentManager().beginTransaction()
            .add(android.R.id.content, flutterFragment)
            .commit();
    }
}
