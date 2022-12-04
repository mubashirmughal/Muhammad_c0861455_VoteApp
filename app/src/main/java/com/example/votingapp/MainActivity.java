package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Spinner droupdown;
    EditText name , Vote_Id;
    ToggleButton tog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}