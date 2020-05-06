package com.bottomNavigationViewNewVersion.mukuljangir.apk;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private ActionBar actionBar;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Demo");
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_call:
                        actionBar.setTitle("Call");
                        return true;
                    case R.id.navigation_setting:
                        actionBar.setTitle("Settings");
                        return true;
                    case R.id.navigation_profile:
                        actionBar.setTitle("Profile");
                        return true;
                    case R.id.navigation_end:
                        actionBar.setTitle("End");
                        return true;
                    case R.id.naviation_rateus:
                        actionBar.setTitle("Rate us");
                        return true;

                }
                return true;
            }
        });

    }
}
