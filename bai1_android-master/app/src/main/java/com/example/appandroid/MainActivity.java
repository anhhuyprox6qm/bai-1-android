package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewlayout2);

        //B1: Data source
        final String[] datas = {"SAMSUNG","LG","HTC","SONY","NOKIA","SAMSUNG",
                "LG","HTC","SONY","NOKIA","SAMSUNG","LG","HTC","SONY",
                "NOKIA","SAMSUNG","LG","HTC","SONY","NOKIA"};

        //B2: Adapter  anhth.na

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, datas);

        //B3: Listview
        ListView lvContact = findViewById(R.id.lvContact);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String data = datas[position];
                Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
    }

    }