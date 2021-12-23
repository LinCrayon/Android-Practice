package com.lsq.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public  class MyReceiver extends BroadcastReceiver {

    private  static  final  String ACTTON1= "xxgcxy";
    private  static  final  String ACTTON2= "fibu";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("xxgcxy")){
            Toast.makeText(context,"信息工程学院广播",Toast.LENGTH_SHORT).show();
        }if(intent.getAction().equals("fjbu")){
            Toast.makeText(context,"福建商学院学院广播",Toast.LENGTH_SHORT).show();
        }

    }
}
