package com.example.forbetter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class rent_location extends AppCompatActivity implements OnMapReadyCallback {
    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_locations);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);

    }
    private GoogleMap googleMap;


    @SuppressLint("MissingInflatedId")
    public void crete(){
        Button btn = (Button) findViewById(R.id.buttonWhere);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rent_location.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        LatLng markerLocation = new LatLng(37.7749, -122.4194); // San Francisco, CA
        googleMap.addMarker(new MarkerOptions().position(markerLocation).title("Marker Title"));


        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerLocation, 12.0f));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}