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
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    public Button buttonLogIn;
    public void login() {
        buttonLogIn = (Button)findViewById(R.id.LogIn);
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action1 = new Intent(MainActivity.this, login.class);
                startActivity(action1);
            }
        });
    }

    public Button buttonSingUp ;
    public void singup() {
        buttonSingUp = (Button)findViewById(R.id.SingUp);
        buttonSingUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent action2 = new Intent(MainActivity.this, singup.class);
                startActivity(action2);
            }
        });
    }
    //crash happens pls fix
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
        MobileAds.initialize(this,initializationStatus -> {

        });
        login();
        singup();
    }



}