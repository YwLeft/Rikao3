package com.example.asus.rikao3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements Mytitle.titleonclicket{
    Mytitle mytitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytitle = (Mytitle) findViewById(R.id.mytitle);
        mytitle.setLitent(this);
    }

    @Override
    public void onbutton1click(View v) {
        Intent intent = new Intent(MainActivity.this,Myactivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void ontetleclick(View v) {

    }

    @Override
    public void onbuttonc2lick(View v) {

    }
}
