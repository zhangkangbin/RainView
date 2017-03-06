package com.zkb.rainview.imp;

import android.graphics.Canvas;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public  interface IBaseView {
    void init();
    void drawRain(Canvas canvas);
    void move();
    int getViewX();
    int getViewY();
    int viewWidth();
    int viewHight();

}
