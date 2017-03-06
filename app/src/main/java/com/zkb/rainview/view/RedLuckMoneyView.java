package com.zkb.rainview.view;

import android.content.Context;
import android.util.AttributeSet;

import com.zkb.rainview.base.BaseRainView;
import com.zkb.rainview.imp.IBaseView;

/**
 * Created by zhangkangbin on 2017/3/6.
 */

public class RedLuckMoneyView extends BaseRainView {

    public RedLuckMoneyView(Context context) {
        super(context);
    }

    public RedLuckMoneyView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }
    public RedLuckMoneyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected IBaseView getBaseView() {
        return new RedLuckMoneyAdapter(getWidth(),getHeight(),getContext());
    }
}
