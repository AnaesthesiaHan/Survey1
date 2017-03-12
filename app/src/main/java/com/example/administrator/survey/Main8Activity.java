package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main8Activity extends AppCompatActivity {
    private RadioGroup RG5;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void onClick(View view) {
        RG5=(RadioGroup)findViewById(R.id.RG5);
        radioButton=(RadioButton) findViewById(RG5.getCheckedRadioButtonId());


        String str = radioButton.getText().toString();

        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent = new Intent(Main8Activity.this, Main9Activity.class);
        startActivity(intent);
    }
}
