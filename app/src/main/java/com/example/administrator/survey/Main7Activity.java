package com.example.administrator.survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void onClick(View view) {
        Intent intent = new Intent(Main7Activity.this, Main8Activity.class);
        startActivity(intent);
    }
}
