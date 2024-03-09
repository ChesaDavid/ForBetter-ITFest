package com.example.forbetter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    public Button singUpButton;
    public Button logInButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MainPage),((v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,systemBars.top,systemBars.right, systemBars.bottom);
            return insets;
        }));
      singUpButton = (Button) findViewById(R.id.SingUpButtonId);
      logInButton = (Button) findViewById(R.id.LogInButtonId);
      singUpButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              OpenSingUp();
          }
      });
      logInButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              OpenLogIn();
          }
      });

    }
    public void OpenSingUp(){
        Intent action = new Intent(this,singup.class);
        startActivity(action);
    }
    public void OpenLogIn(){
        Intent action = new Intent(this,login.class);
        startActivity(action);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}