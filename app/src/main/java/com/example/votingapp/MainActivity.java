package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Spinner droupdown;
    EditText name , Vote_Id;
    ToggleButton tog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.chkBtn);
        droupdown = (Spinner) findViewById(R.id.mainType);
        name = (EditText) findViewById(R.id.nameEt);
        Vote_Id = (EditText) findViewById(R.id.VoteId);
        tog = (ToggleButton) findViewById(R.id.togbtn);

        tog.setText("Accept");
        tog.setTextOff("Accept");
        tog.setTextOn("Refuse");

        String[] arr = new String[] {};
        String[] arr2 = new String[] {};

        List<String> arrList
                = new ArrayList<String>(
                Arrays.asList(arr));
        List<String> arrList2
                = new ArrayList<String>(
                Arrays.asList(arr2));

        btn.setOnClickListener(v -> {
//                String name = name.getText().toString().trim();
            String namee = name.getText().toString().trim();
            String vote_id = Vote_Id.getText().toString().trim();
            String spinner = droupdown.getSelectedItem().toString();

            if ((namee.length()>0) && (vote_id.length()>0) && (spinner!="Choose a Candidate")){
                arrList.add(namee);
                arrList2.add(vote_id);
                Toast.makeText(MainActivity.this,"Voted Successfully" , Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "CANDIDATE ALREADY EXIST",Toast.LENGTH_SHORT).show();
            }

        });



    }
}