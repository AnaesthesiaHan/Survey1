package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileOutputStream;

public class Main13Activity extends AppCompatActivity {
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
     editText=(EditText) findViewById(R.id.editText);
    }



    public void onClick(View view) {
        String str = editText.getText().toString();
        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent = new Intent(Main13Activity.this, Main14Activity.class);
        startActivity(intent);
    }
}
