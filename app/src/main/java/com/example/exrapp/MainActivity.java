package com.example.exrapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.home:
                        
                        return true;
                    case R.id.companies:
                        startActivity(new Intent(getApplicationContext(), Companies.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.maps:
                        startActivity(new Intent(getApplicationContext(), Maps.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
            });
    }
}