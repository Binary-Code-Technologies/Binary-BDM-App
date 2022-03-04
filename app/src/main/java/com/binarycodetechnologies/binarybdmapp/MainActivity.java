package com.binarycodetechnologies.binarybdmapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirebaseFirestore db = FirebaseFirestore.getInstance();

        EditText name = findViewById(R.id.bizNameET);
        EditText kw1 = findViewById(R.id.keywordET1);
        EditText kw2 = findViewById(R.id.keywordET2);
        EditText kw3= findViewById(R.id.keywordET3);
        EditText kw4 = findViewById(R.id.keywordET4);
        EditText cate = findViewById(R.id.categoryET);
        EditText addre = findViewById(R.id.addressET);
        EditText bizhour = findViewById(R.id.bizHoursET);
        EditText mail = findViewById(R.id.emailET);
        EditText phnum1 = findViewById(R.id.phoneNumET);
        EditText phnum2 = findViewById(R.id.phoneNumET2);
        EditText descr = findViewById(R.id.descriptionET);
        EditText produ = findViewById(R.id.productET);
        EditText opdt = findViewById(R.id.openET);
        EditText servi = findViewById(R.id.serviceET);
        EditText pmtmo = findViewById(R.id.bizNameET);
        Button next = findViewById(R.id.nextBtn);
        next.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v){
                String nameSt=name.getText().toString();
                String key1=kw1.getText().toString();
                String key2=kw2.getText().toString();
                String key3=kw3.getText().toString();
                String key4=kw4.getText().toString();
                String cat=cate.getText().toString();
                String addr=addre.getText().toString();
                String bizHour=bizhour.getText().toString();
                String email=mail.getText().toString();
                String phNo1=phnum1.getText().toString();
                String phNo2=phnum2.getText().toString();
                String desc=descr.getText().toString();
                String openDt=opdt.getText().toString();
                String prod=produ.getText().toString();
                String serv=servi.getText().toString();
                String pmtMode=pmtmo.getText().toString();

                Log.i("test" , nameSt);
                // Create a new user with a first and last name
//                Map<String, Object> user = new HashMap<>();
//                user.put("first", "Ada");
//                user.put("last", "Lovelace");
//                user.put("born", 1815);
//
//// Add a new document with a generated ID
//                db.collection("users")
//                        .add(user)
//                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                            @Override
//                            public void onSuccess(DocumentReference documentReference) {
//                                Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
//                            }
//                        })
//                        .addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull Exception e) {
//                                Log.w(TAG, "Error adding document", e);
//                            }
//                        });


            }
        });
    }
}