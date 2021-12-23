package com.lsq.mytest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
        paint.setAntiAlias(true);   //抗锯齿
        paint.setColor(0xFFA47739);

        //head

        RectF rectF = new RectF(10,10,100,100);
        rectF.offset(90,20);
        canvas.drawArc(rectF ,-10,-180,false,paint);
        //eye
        paint.setColor(0xFFFFFFFF);
        canvas.drawCircle(165,53,4,paint);
        canvas.drawCircle(125,53,4,paint);
        //wifi
        paint.setStrokeWidth(2);
        paint.setColor(0xFFA4C730);
        canvas.drawLine(100,15,125,35,paint);
        canvas.drawLine(180,15,165,35,paint);






    }
}
