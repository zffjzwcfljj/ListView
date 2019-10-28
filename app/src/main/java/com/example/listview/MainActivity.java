package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] data={"zff","zxy","hzq"};
    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudents();
        idem adapter = new idem(MainActivity.this,R.layout.name_item,studentList);
        String[] name = {"zff","zxy","hzq"};
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);



    }
    private void initStudents(){
        for (int i=0; i<1; i++){
            Student zff = new Student("ZFF","1704","001");
            studentList.add(zff);

            Student zxy = new Student("ZXY","1705","002");
            studentList.add(zxy);

            Student hzq = new Student("HZQ","1706","003");
            studentList.add(hzq);
        }
    }


    }






