package com.lsq.myfirst;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * @author linshengqian
 */
public class demo extends View {
    public demo(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0xFFA47739);



        paint.setColor(0xFFFFFF00);
        canvas.drawCircle(400,200,50,paint);
        canvas.drawCircle(500,200,50,paint);
        canvas.drawCircle(600,200,50,paint);
        canvas.drawCircle(700,200,50,paint);
        canvas.drawCircle(300,200,50,paint);


        Paint _debugInfoPaint = new Paint(Paint.ANTI_ALIAS_FLAG); //设置无锯齿也可使用setAntiAlias(true)
        _debugInfoPaint.setColor(Color.GREEN);//设置画笔颜色
        _debugInfoPaint.setAlpha(300);
        _debugInfoPaint.setStrokeWidth(1.5f);//设置线宽
        _debugInfoPaint.setStyle(Paint.Style.FILL);//设置样式：FILL表示颜色填充整个；STROKE表示空心
        canvas.drawRoundRect(new RectF(200, 50, 600, 200), 10, 10, _debugInfoPaint);
        canvas.drawRoundRect(new RectF(50, 150, 600, 100), 1000, 800, _debugInfoPaint);
        canvas.drawRoundRect(new RectF(200, 100, 800, 200), 10, 10, _debugInfoPaint);

    }
}
