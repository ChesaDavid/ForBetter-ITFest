package com.example.forbetter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.forbetter.ui.main.MainViewModel;
import com.example.forbetter.ui.main.MapFragment;

public class screenmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screenmain);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MainScreen), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Button pedom = (Button) findViewById(R.id.pedometerId);
        pedom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(screenmain.this,pedometerapp.class);
                startActivity(action);
            }
        });
        Button map = (Button) findViewById(R.id.scooterLoc);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(screenmain.this, scooter.class);
                startActivity(action);
            }
        });
    }
}