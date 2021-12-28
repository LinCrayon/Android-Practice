package com.lsq.myfirst;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author linshengqian
 */
public class XinwenActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinwen2);

        TextView textView = (TextView) findViewById(R.id.new1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XinwenActivity2.this,XinwenActivity3.class);
                startActivity(intent);
            }
        });

    }
}
