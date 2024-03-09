//package com.example.forbetter;
//
//import com.google.android.gms.maps.MapView;
//
//import android.os.Bundle;
//
//import javax.swing.*;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class rent_location extends AppCompatActivity  {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.rent_locations);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MapsLoc), ((v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        }));
//
//    }
//    public MapView mapView;
//    public void setMapView(){
////        mapView = findViewById(R.id.mapVi);
//    }
//
//}