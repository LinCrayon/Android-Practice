package com.lsq.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class ManhuaActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhua4);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mhb3);
        frameLayout.addView(new MyView(this));
    }
}