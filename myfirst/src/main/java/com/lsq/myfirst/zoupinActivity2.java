package com.lsq.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class zoupinActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoupin2);
        FrameLayout frameLayout =(FrameLayout) findViewById(R.id.myFL);
        frameLayout.addView(new demo(this));
    }
}