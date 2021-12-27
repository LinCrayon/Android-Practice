package com.lsq.myaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.HashMap;

/**
 * @author linshengqian
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =(ListView ) findViewById(R.id.myLV);
        AudioAttributes attributes = new AudioAttributes.Builder()
        .setUsage(AudioAttributes.USAGE_MEDIA)
        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
        .build();


       SoundPool soundPool =new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .setMaxStreams(8)
                .build();


      final HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,soundPool.load(this,R.raw.backroad,1));
        hashMap.put(0,soundPool.load(this,R.raw.bigeasy,1));
        hashMap.put(0,soundPool.load(this,R.raw.bollywood,1));
        hashMap.put(0,soundPool.load(this,R.raw.bussamove,1));
        hashMap.put(0,soundPool.load(this,R.raw.cairo,1));
        hashMap.put(0,soundPool.load(this,R.raw.champagneedition,1));
        hashMap.put(0,soundPool.load(this,R.raw.bussamove,1));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                soundPool.play(hashMap.get(position),1,1,0,0,1);
            }
        });

    }
}