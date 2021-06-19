package com.synsoft.musicstreamer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize the bottom navigation view
        //create bottom navigation view object
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        //NavController navController = Navigation.findNavController(bottomNavigationView);

        NavigationUI.setupWithNavController(bottomNavigationView,
                Navigation.findNavController(this, R.id.nav_fragment));

    }
}