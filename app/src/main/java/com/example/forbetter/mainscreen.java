package com.example.forbetter;

import java.io.*;
import java.sql.*;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.textfield.TextInputEditText;
import java.util.regex.Pattern;

public class mainscreen extends AppCompatActivity{
    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
    public Button scooter;
    public void setScooter(){
        scooter = (Button) findViewById(R.id.scooterLoc);
        scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            @NonNull
            public void onClick(View v) {
                Intent locations = new Intent(mainscreen.this,scooter_location.class);
                startActivity(locations);
            }
        });
    }
    public Button pedometer;
    public void setPedometer(){
        pedometer = (Button) findViewById(R.id.pedometerId);
        pedometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent action = new Intent(mainscreen.this,app_pedometer.class);
              //  startActivity(action);
            }
        });
    }
    public Button rentFrom;
    public void setRentFrom(){
        //rentFrom = (Button) findViewById(R.id.rentFromId);
        rentFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent action = new Intent(mainscreen.this,rent_location.class);
             //   startActivity(action);
            }
        });
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    public TextView nameProfile;
    public void setNameProfile(){
        //nameProfile = (TextView) findViewById(R.id.profileName);
        //Link with database
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.mainscreen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MainScreen),((v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,systemBars.top,systemBars.right,systemBars.bottom);
            return insets;
        }));

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        setScooter();
        setPedometer();
        setRentFrom();
        setNameProfile();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
