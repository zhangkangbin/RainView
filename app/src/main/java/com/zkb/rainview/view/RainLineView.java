package com.zkb.rainview.view;

import android.content.Context;
import android.util.AttributeSet;

import com.zkb.rainview.base.BaseRainView;
import com.zkb.rainview.imp.IBaseView;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class RainLineView extends BaseRainView {

    public RainLineView(Context context) {
        super(context);
    }

    public RainLineView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }
    public RainLineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected IBaseView getBaseView() {
        return new RainLineViewAdapter(getWidth(),getHeight());
    }
}
