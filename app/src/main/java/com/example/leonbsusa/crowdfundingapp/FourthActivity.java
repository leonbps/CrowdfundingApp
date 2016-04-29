package com.example.leonbsusa.crowdfundingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    /** Chamado quando clica o botao logo */
    public void startMainActivity(View view) {

        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
}
