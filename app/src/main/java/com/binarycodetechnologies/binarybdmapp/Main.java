package com.binarycodetechnologies.binarybdmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        Button addNew = findViewById(R.id.addNewBtn);
        addNew.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Main.this, MainActivity.class));
            }
        });
        Button editExt = findViewById(R.id.editExtBtn);
        editExt.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Main.this, EditAct.class));
            }
        });
    }
}