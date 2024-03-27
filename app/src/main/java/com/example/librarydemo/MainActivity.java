package com.example.librarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demolibrary.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleToast simpleToast= new SimpleToast();
        simpleToast.longToast(this,"Hi");
    }
}