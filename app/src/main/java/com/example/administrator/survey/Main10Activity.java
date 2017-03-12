package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main10Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private String[] money={"0-500","501-1000","1001-2000","2001-5000","5001-10000","10001-30000","30000-50000"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Main10Activity.this,android.R.layout.simple_list_item_1,money);
        listView=(ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = listView.getItemAtPosition(position).toString();
        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent = new Intent(Main10Activity.this, Main11Activity.class);
        startActivity(intent);

    }


}