package com.lsq.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class ManhuaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhua2);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mhb1);
        frameLayout.addView(new MyView(this));

        Button btn1 = findViewById(R.id.mhbt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManhuaActivity2.this,ManhuaActivity3.class);
                startActivity(intent);
            }
        });
    }
}