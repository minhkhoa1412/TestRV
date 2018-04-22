package com.example.minhkhoa.testrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SinhVien> sinhVienArrayList;
    private static String LOG_CAT_COUNT = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapping

        //init array
        sinhVienArrayList = new ArrayList<>();
        //add data array
        sinhVienArrayList.add(new SinhVien(1,"Thai Minh Khoa"));
        sinhVienArrayList.add(new SinhVien(2,"Nguyen Quoc Trong"));
        Log.d(LOG_CAT_COUNT,String.valueOf(sinhVienArrayList.size()));
        //init adapter

        //set adapter
    }
}
