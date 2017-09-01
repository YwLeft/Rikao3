package com.example.asus.rikao3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Myactivity extends AppCompatActivity implements Mytitle.titleonclicket {
    Mytitle mytitle;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytitle);
        mytitle = (Mytitle) findViewById(R.id.mytitle);
        text = (TextView) mytitle.findViewById(R.id.title);
        text.setText("我是第二个页面");
        mytitle.setLitent(this);

    }

    @Override
    public void onbutton1click(View v) {
        finish();

    }

    @Override
    public void ontetleclick(View v) {

    }

    @Override
    public void onbuttonc2lick(View v) {

    }
}