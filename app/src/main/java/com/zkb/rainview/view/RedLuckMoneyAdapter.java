package com.zkb.rainview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import com.zkb.rainview.R;
import com.zkb.rainview.base.BaseRainModel;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class RedLuckMoneyAdapter extends BaseRainModel
{
    private Bitmap bitmap;

    public RedLuckMoneyAdapter(int mWidth, int mHight, Context context) {
        super(mWidth, mHight);
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.redbao);
    }

    public  void drawView(Canvas canvas, int mStartX, int mStartY, Paint paint) {

        canvas.drawBitmap(bitmap,mStartX,mStartY,paint);
        //    canvas.drawLine(mStartX,mStartY,mStopX,mStartY+mRainHeght,mPaint);
    }


    public  int getViewWidth() {
//      Log.v("mytest","getWidth..."+bitmap.getWidth());

        return bitmap.getWidth();
    }


    public int viewHight() {
        return super.viewHight();
    }


    public int getViewHight() {
    //    Log.v("mytest","getHeight..."+bitmap.getHeight());
        return bitmap.getHeight();
    }



}
