package com.zkb.rainview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.zkb.rainview.base.BaseRainModel;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class TextViewAdapter extends BaseRainModel
{
    private String mStr="Android";
    public TextViewAdapter(int mWidth, int mHight) {
        super(mWidth, mHight);
        getPaint().setTextSize(30);
    }


    public  void drawView(Canvas canvas, int mStartX, int mStartY, Paint paint) {

        paint.setTextSize(30);
        canvas.drawText(mStr,mStartX,mStartY,paint);
     //   canvas.drawLine(mStartX,mStartY,mStartX,mStartY+Hight,paint);
    }

    @Override
    public int getViewWidth() {
       int w= (int) getPaint().measureText(mStr);
        return  w;
    }

    @Override
    public  int getViewHight() {
        int w= (int)  getPaint().measureText(mStr);
        return  w;
    }


}
