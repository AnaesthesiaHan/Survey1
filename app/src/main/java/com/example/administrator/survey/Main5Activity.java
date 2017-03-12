package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main5Activity extends AppCompatActivity {
    private RadioGroup RG4;
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onClick(View view) {
        RG4=(RadioGroup)findViewById(R.id.RG4);
        radioButton=(RadioButton) findViewById(RG4.getCheckedRadioButtonId());


        String str = radioButton.getText().toString();

        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");

        Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(intent);
    }
}
