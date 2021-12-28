package com.lsq.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class ManhuaActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhua3);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mhb2);
        frameLayout.addView(new MyView(this));

        Button btn2 = findViewById(R.id.mhbt2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManhuaActivity3.this,ManhuaActivity4.class);
                startActivity(intent);
            }
        });

    }
}