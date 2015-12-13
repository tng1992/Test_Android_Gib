package com.tapster.vid68;

// Working with GitHub. When doing so, we need to prepare the app for "Version Control". It's the VCS
// menu at the top of Android Studio. Click VCS > "Enable Version Control Integration" > Choose "Git"
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
