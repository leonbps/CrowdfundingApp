package com.example.leonbsusa.crowdfundingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    /** Chamado quando clica o botao enviar */
    public void startFifthActivity(View view) {

        Intent fifthActivity = new Intent(this, FifthActivity.class);
        startActivity(fifthActivity);
    }
}
