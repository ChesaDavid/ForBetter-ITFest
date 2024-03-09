package com.example.forbetter;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.textfield.TextInputEditText;
import java.util.regex.Pattern;

//nevoie de un link cu database.sql
public class login extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN=
            Pattern.compile("^"+
                    "(?=.*[@#$%^&+=]])"+
                    "(?=\\S+$)"+
                    ".{4,}"+
                    "$}");
    private TextInputEditText password;
    private TextInputEditText email;

    public Button loginbutton;
    public void loginButton(){
        loginbutton = (Button) findViewById(R.id.singupButton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validatePassword() & validateEmail()){
                    Intent startApp = new Intent(login.this, mainscreen.class);
                    startActivity(startApp);
                }
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LogIn),((v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }));
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        loginButton();

    }
    private boolean validateEmail(){
        String emailInput = email.getText().toString().trim();

        if(emailInput.isEmpty()){
            email.setError("Field cannot be empty");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            email.setError("Please enter a valid email address");
            return false;
        }else{
            email.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwordInput = password.getText().toString().trim();

        if(passwordInput.isEmpty()){
            password.setError("This field cannot be empty");
            return false;
        }
        else if(!PASSWORD_PATTERN.matcher(passwordInput).matches()){
            password.setError("Invalid password.Password is to weak");
            return false;
        }//else if inputPassword != right password
        else{
            password.setError(null);
            return true;
        }

    }

}
