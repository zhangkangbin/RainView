package com.zkb.rainview.view;

import android.content.Context;
import android.util.AttributeSet;

import com.zkb.rainview.base.BaseRainView;
import com.zkb.rainview.imp.IBaseView;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class TextViewRain extends BaseRainView {

    public TextViewRain(Context context) {
        super(context);
    }

    public TextViewRain(Context context, AttributeSet attrs) {
        super(context, attrs);

    }
    public TextViewRain(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected IBaseView getBaseView() {
        return new TextViewAdapter(getWidth(),getHeight());
    }
}
