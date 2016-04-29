package com.example.leonbsusa.crowdfundingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Chamado quando clica o botao doar agora! */
    public void startSecondActivity(View view) {

        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }
}
