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

       canvas.drawText("在很久很久以前，唐三藏为了在大唐弘扬佛教，习得大乘教法。",100,400,paint);
       canvas.drawText("随后他便受到菩萨指点，携四位徒弟一同降妖除魔，求取真经。",400,600,paint);

    }
}

