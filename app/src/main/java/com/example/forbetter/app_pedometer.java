/*package com.example.forbetter;

import android.hardware.SensorManager;
import android.os.Bundle;
<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

=======
import android.widget.TextView;
>>>>>>> 270744f4d40a910ef574b4bec3a8bef42670f21c

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;


public class app_pedometer extends AppCompatActivity {

    public TextView steps;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.app_pedometer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.app_pedoId),((v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,systemBars.top,systemBars.right, systemBars.bottom);
            return insets;
        }));
    }
}*/
