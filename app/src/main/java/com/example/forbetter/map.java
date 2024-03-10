package com.example.forbetter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.forbetter.ui.main.MapFragment;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapscreen);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MapFragment.newInstance())
                    .commitNow();
        }
    }
}