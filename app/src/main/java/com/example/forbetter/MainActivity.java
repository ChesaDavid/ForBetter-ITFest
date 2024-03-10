package com.example.forbetter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.forbetter.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    public Button singUpEnter;
    public Button logInEnter;
    @SuppressLint("MissingInflatedId")
    @Override
    @NonNull
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
        singUpEnter = findViewById(R.id.SingUpButtonId);
        logInEnter = findViewById(R.id.LogInButtonId);
        singUpEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            @NonNull
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,singuppage.class);
                startActivity(intent);
            }
        });
        logInEnter.setOnClickListener(new View.OnClickListener(){
            @Override
            @NonNull
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
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

