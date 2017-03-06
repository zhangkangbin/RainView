package com.zkb.rainview.base;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.zkb.rainview.imp.IBaseView;

import java.util.Random;

/**
 * Created by zhangkangbin on 2017/3/5.
 */

public abstract class BaseRainModel implements IBaseView {

    private int mWidth;
    private int mHight;
    private int mViewWidth;
    private int mViewHight;
    private int mStartX;
    private int mStartY;
   // private int mStopX;
//  private int mStopY;
    protected Random mRandom=new Random();
  //  private int mRainHeght;
    private int mSpeed; //速度
    private Paint mPaint;
    public BaseRainModel(int mWidth, int mHight){
        this.mWidth=mWidth;
        this.mHight=mHight;
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(mRandom.nextInt(12)+1);
        mPaint.setColor(Color.BLUE);

      //  mPaint.setAlpha(mRandom.nextInt(200)+1); //随机透明度

       // init();
    }

    public void drawRain(Canvas canvas){
        drawView(canvas,mStartX,mStartY,mPaint);
        //canvas.drawLine(100,100,100,200,mPaint);
     //   Log.v("mytest","drawRain..."+mStartX+"--"+mStartY+"--"+mStopX+"--"+mStopY);
    }



    public  void move(){
        mStartY=mStartY+mSpeed;
        if(mStartY>mHight){
            init();
        }

    }

    public void  init(){
     //  Log.v("mytest","init..."+viewWidth());
        mSpeed=mRandom.nextInt(15)+5;
        mStartX = mRandom.nextInt(mWidth-viewWidth()); //避免视图画在屏幕外
        mStartY=mRandom.nextInt(mHight);
  //      mRainHeght=mRandom.nextInt(200);
    //    mStopY=mStartY+mRainHeght;
     //   Log.v("mytest","init..."+mStartX+"--"+mStartY+"--"+mStopX+"--"+mStopY);
    }
    @Override
    public int getViewX() {
        return mStartX;
    }

    @Override
    public int getViewY() {
        return mStartY;
    }
    @Override
    public int viewWidth() {
        mViewWidth=getViewWidth();
        return mViewWidth;
    }

    public Paint getPaint(){
        return  mPaint;
    }
    @Override
    public int viewHight() {
        Log.v("mytest","BaseRainModel..viewHight.");
        mViewHight=getViewHight();
        return mViewHight;
    }

    public  abstract void drawView(Canvas canvas, int mStartX, int mStartY, Paint paint);
    public abstract int getViewWidth();
    public abstract int getViewHight();

}
