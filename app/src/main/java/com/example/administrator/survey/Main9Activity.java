package com.example.administrator.survey;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main9Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private String[] data={"Business type","Vacation type","Conference type","Sightseeing type","Cheap type","Apartment type","Individuation type"};
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Main9Activity.this,android.R.layout.simple_list_item_1,data);
        listView=(ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);

    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = listView.getItemAtPosition(position).toString();
        ja.writeTxtToFile(str+"\n", Environment.getExternalStorageDirectory().getPath()+"/survey/", "result.txt");
        Intent intent = new Intent(Main9Activity.this, Main10Activity.class);
        startActivity(intent);

    }
}
