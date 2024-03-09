package com.example.forbetter;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scooter_location extends AppCompatActivity {
    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.scooter_locations);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.scooter_loaction),((v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,systemBars.top,systemBars.right, systemBars.bottom);
            return insets;
        }));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
