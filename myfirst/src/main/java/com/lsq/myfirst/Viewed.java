package com.lsq.myfirst;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * @author linshengqian
 */
public class Viewed extends View {
    public Viewed(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0xFFA47739);

        //head

        RectF rectF = new RectF(10, 10, 100, 100);
        rectF.offset(90, 20);
        canvas.drawArc(rectF, -10, -180, false, paint);

         }
    }