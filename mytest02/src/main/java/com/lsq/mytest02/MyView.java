package com.lsq.mytest02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint  = new Paint();
       paint.setColor(0xFFFF0000);
       paint.setAntiAlias(true);
       paint.setTextAlign(Paint.Align.LEFT);
       paint.setTextSize(64);

       canvas.drawText("吃了吗",100,400,paint);
       canvas.drawText("吃了",400,600,paint);

    }
}

