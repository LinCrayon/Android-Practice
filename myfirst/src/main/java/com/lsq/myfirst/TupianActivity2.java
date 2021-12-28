package com.lsq.myfirst;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TupianActivity2 extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private ViewFlipper flipper;
    private GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupian2);
        detector = new GestureDetector(this);
        flipper = (ViewFlipper) this.findViewById(R.id.ViewFlipper);

        flipper.addView(addImageView(R.drawable.bg1));
        flipper.addView(addImageView(R.drawable.bg2));
        flipper.addView(addImageView(R.drawable.bg3));
        flipper.addView(addImageView(R.drawable.bg4));
        flipper.addView(addImageView(R.drawable.bg5));
        flipper.addView(addImageView(R.drawable.bg6));
        flipper.addView(addImageView(R.drawable.bg7));
        flipper.addView(addImageView(R.drawable.bg8));
    }

    private View addImageView(int id) {
        ImageView iv = new ImageView(this);
        iv.setImageResource(id);
        return iv;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.detector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        if (e1.getX() - e2.getX() > 120) {
            this.flipper.showNext();
            return true;
        } else if (e1.getX() - e2.getX() < -120) {
            this.flipper.showPrevious();
            return true;
        }

        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

}