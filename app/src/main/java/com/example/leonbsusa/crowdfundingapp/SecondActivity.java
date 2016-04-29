package com.example.leonbsusa.crowdfundingapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /** Chamado quando clica o botao enviar */
    public void startThirdActivity(View view) {

        Intent thirdActivity = new Intent(this, ThirdActivity.class);
        startActivity(thirdActivity);
    }

    /** Chamado quando clica o botao info */
    public void startFourthActivity(View view) {

        Intent fourthActivity = new Intent(this, FourthActivity.class);
        startActivity(fourthActivity);
    }
}
