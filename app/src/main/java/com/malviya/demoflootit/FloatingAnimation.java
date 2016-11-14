package com.malviya.demoflootit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by 23508 on 11/11/2016.
 */

public class FloatingAnimation {

    private final Bitmap icon;
    private int mX;
    private int mY;
    private int mW;
    private int mH;
    private int speed;

    public FloatingAnimation(Context context, float x, float y, int speed) {
        icon = BitmapFactory.decodeResource(context.getResources(),R.drawable.b);
        mX = (int )x;
        mY = (int) y;
        this.speed =speed;
    }

    public boolean cycle(FloatingAnimation mAnimation, ArrayList<FloatingAnimation> animation){
        if(mY > (-icon.getHeight()-10)){
            mY-=speed;
        }else{
            //animation.remove(mAnimation);
            return true;
        }

        return false;
    }

    public void rander(Canvas canvas, Paint paint){
          canvas.drawBitmap(icon,mX,mY,paint);
    }

    public int getmX() {
        return mX;
    }

    public void setmX(int mX) {
        this.mX = mX;
    }

    public int getmY() {
        return mY;
    }

    public void setmY(int mY) {
        this.mY = mY;
    }

    public int getmW() {
        return mW;
    }

    public void setmW(int mW) {
        this.mW = mW;
    }

    public int getmH() {
        return mH;
    }

    public void setmH(int mH) {
        this.mH = mH;
    }
}
