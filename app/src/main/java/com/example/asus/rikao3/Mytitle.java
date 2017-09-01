package com.example.asus.rikao3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Mytitle extends LinearLayout {
    private Button mbutton1;
    private TextView mtitle;

    titleonclicket litent;

    public void setLitent(titleonclicket litent) {
        this.litent = litent;
    }

    public Mytitle(Context context) {
        super(context);
    }

    private void init(AttributeSet attrs) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.title,this);
        mbutton1 = (Button) view.findViewById(R.id.button1);
        mtitle = (TextView) view.findViewById(R.id.title);
        mbutton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                litent.onbutton1click(v);
            }
        });
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs,R.styleable.Mytitle1);
        int button1size = typedArray.getDimensionPixelSize(R.styleable.Mytitle1_button1size,22);
        int titlesize = typedArray.getDimensionPixelSize(R.styleable.Mytitle1_titlesize,18);

        String button1text = typedArray.getString(R.styleable.Mytitle1_button1text);
        String titletext = typedArray.getString(R.styleable.Mytitle1_titletext);

        int button1color = typedArray.getColor(R.styleable.Mytitle1_button1color,Color.WHITE);
        int titlecolor= typedArray.getColor(R.styleable.Mytitle1_titlecolor,Color.YELLOW);

        typedArray.recycle();

        mbutton1.setTextSize(button1size);
        mtitle.setTextSize(titlesize);

        mbutton1.setBackgroundColor(button1color);
        mtitle.setBackgroundColor(titlecolor);

       mbutton1.setText(button1text+R.string.app_name);
        mtitle.setText(titletext+"标题");


    }


    public Mytitle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }
    public interface titleonclicket{
        void onbutton1click(View v);
        void ontetleclick(View v);
        void onbuttonc2lick(View v);
    }
}
