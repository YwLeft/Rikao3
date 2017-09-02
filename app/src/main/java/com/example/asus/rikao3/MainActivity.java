package com.example.asus.rikao3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Mytitle.titleonclicket{
    Mytitle mytitle;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytitle = (Mytitle) findViewById(R.id.mytitle);
        mytitle.setLitent(this);
        button1 = (Button) mytitle.findViewById(R.id.button1);
        button2 = (Button) mytitle.findViewById(R.id.button2);
    }


    @Override
    public void onbutton1click(View v) {
        Toast.makeText(this, "点击的是返回", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void ontetleclick(View v) {

    }

    @Override
    public void onbutton2click(View v) {
        Toast.makeText(this, "点击的是更多", Toast.LENGTH_SHORT).show();


    }
}
