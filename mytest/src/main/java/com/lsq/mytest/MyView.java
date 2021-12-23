package com.lsq.mytest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * @author linshengqian
 */
public class MyView extends View {
    public MyView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(0xFFBB86FC);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(10,10,1000,1000,paint);
    }
}
