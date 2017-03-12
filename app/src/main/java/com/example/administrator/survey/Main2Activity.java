package com.example.administrator.survey;

import android.content.Intent;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Main2Activity extends AppCompatActivity {
    private RadioGroup RG1;
    private RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public  void  onClick(View view){
         RG1=(RadioGroup)findViewById(R.id.RG1);
         radioButton=(RadioButton) findViewById(RG1.getCheckedRadioButtonId());


        String str = radioButton.getText().toString();

        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }
}
