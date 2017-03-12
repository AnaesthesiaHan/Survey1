package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main4Activity extends AppCompatActivity {
    private RadioGroup RG3;
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void onClick(View view) {
        RG3=(RadioGroup)findViewById(R.id.RG3);
        radioButton=(RadioButton) findViewById(RG3.getCheckedRadioButtonId());


        String str = radioButton.getText().toString();

        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}
