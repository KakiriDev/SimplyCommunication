package com.kakiridev.simplycommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Lobby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser userFB = mAuth.getCurrentUser();
        TextView tv = findViewById(R.id.tv);
        tv.setText("Hello " + userFB.getDisplayName().toString() );
    }
}
