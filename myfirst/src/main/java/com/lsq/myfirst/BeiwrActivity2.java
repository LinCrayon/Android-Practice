package com.lsq.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BeiwrActivity2  extends AppCompatActivity {
    byte[] bytes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beiwr2);

        EditText editText = (EditText) findViewById(R.id.myET);
        Button btnSave = (Button) findViewById(R.id.btnSave);
        Button btncancel = (Button) findViewById(R.id.btnCancel);

        btnSave .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileOutputStream fos= null;
                String content = editText.getText().toString();
                try{
                    fos = openFileOutput("text",MODE_PRIVATE);
                    fos.write(content.getBytes());
                    fos.flush();//清除缓存
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fos!=null){
                        try {
                            fos.close();
                            Toast.makeText(BeiwrActivity2.this,"文件保存成功",Toast.LENGTH_SHORT).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        //读取备忘录信息
        FileInputStream fis = null;
        try {
            fis = openFileInput("text");
            bytes = new  byte[fis.available()];
            fis.read(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String result = new String(bytes);
                editText .setText(result);
            }
        }


    }
}