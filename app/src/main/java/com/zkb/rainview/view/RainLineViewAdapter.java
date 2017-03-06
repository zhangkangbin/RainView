package com.zkb.rainview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.zkb.rainview.base.BaseRainModel;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class RainLineViewAdapter extends BaseRainModel
{
    private int Hight;
    public RainLineViewAdapter(int mWidth, int mHight) {
        super(mWidth, mHight);
        Hight=  mRandom.nextInt(200);
    }


    public  void drawView(Canvas canvas, int mStartX, int mStartY, Paint paint) {
        canvas.drawLine(mStartX,mStartY,mStartX,mStartY+Hight,paint);
    }


    public int getViewWidth() {
        return 0;
    }


    public int getViewHight() {
        return 0;
    }


}
