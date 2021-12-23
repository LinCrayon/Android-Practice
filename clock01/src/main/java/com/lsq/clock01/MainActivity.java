package com.lsq.clock01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker timePicker = (TimePicker) findViewById(R.id.myTime);
        timePicker.setIs24HourView(true);

        Button button = (Button) findViewById(R.id.btnSet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AlarmActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,011,intent,0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY,timePicker.getCurrentHour());
                calendar.set(Calendar.SECOND,0);
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);
                Toast.makeText(MainActivity.this,"设置时钟",Toast.LENGTH_SHORT).show();
            }
        });


    }
}