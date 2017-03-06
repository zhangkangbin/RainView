package com.zkb.rainview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.zkb.rainview.base.BaseRainModel;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class CirleAdapter extends BaseRainModel
{
    private int radius;
    public CirleAdapter(int mWidth, int mHight) {
        super(mWidth, mHight);
        radius=  mRandom.nextInt(50);
    }

    public void drawView(Canvas canvas, int mStartX, int mStartY, Paint paint) {

        canvas.drawCircle(mStartX,mStartY,radius,paint);

    }


    public  int getViewWidth() {
        return radius*2;
    }


    public int getViewHight() {
        return radius*2;
    }


}
