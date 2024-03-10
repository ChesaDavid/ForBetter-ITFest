package com.example.forbetter;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.forbetter.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {
    public Button singUpEnter;
    public Button logInEnter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MainPage), ((v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
           }));
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        logInEnter = findViewById(R.id.LogInButtonId);
        logInEnter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent o = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(o);

            }
        });
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
}

