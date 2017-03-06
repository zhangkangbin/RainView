package com.zkb.rainview.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.zkb.rainview.R;
import com.zkb.rainview.imp.IBaseView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhangkangbin on 2017/3/5.
 */
public  abstract class BaseRainView extends  View{
    private Thread mThread;
    private  ViewOnClick mViewOnClick;
    private List<IBaseView> mListRain=new ArrayList<>();
    private int mCount;
    public BaseRainView(Context context) {
        super(context);
    }
    public BaseRainView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(context,attrs);

    }
    public BaseRainView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context,attrs);

    }

    private void initList(){
        for(int i=0;i<mCount;i++){
            IBaseView  rain=getBaseView();
            rain.init();
            mListRain.add(rain);
        }

    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mThread==null){
            initList();
             mThread=new MyThread();
             mThread.start();
        }else {
            for(IBaseView rain:mListRain){
                rain.drawRain(canvas);

            }
        }


    }
    private void  initAttrs(Context context, AttributeSet attrs){
        TypedArray typedArray=context.obtainStyledAttributes(attrs , R.styleable.BaseRainView);
        if(typedArray!=null){
            mCount= typedArray.getInt(R.styleable.BaseRainView_num,0);
            typedArray.recycle();
        }
    }
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:

                int x= (int) event.getX();
                int y= (int) event.getY();
             //   Log.v("mytest","ACTION_DOWN..."+x+"---"+y);
                for(IBaseView rain:mListRain){
                    if(rain.getViewX()<x&&x<(rain.getViewX()+rain.viewWidth())
                            &&rain.getViewY()<y&&y<(rain.getViewY()+rain.viewHight())){
                      //  Log.v("mytest","onclick..."+rain.getViewX());
                        //事件点击的处理
                        if(mViewOnClick!=null){
                            mViewOnClick.onClick("onClick-"+rain.getViewY());
                        }
                    }
                }


                break;

        }

        return super.onTouchEvent(event);
    }

    class MyThread extends Thread{
        public void run() {
            super.run();
            while (true){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(IBaseView rain:mListRain){
                 rain.move();
                }
                postInvalidate();
            }



        }
    }


    public void setOnClickView(ViewOnClick viewOnClick){
        if(viewOnClick!=null){

            this.mViewOnClick=viewOnClick;
        }
    }
    public interface  ViewOnClick{

        void  onClick(String s);
    }
    abstract protected IBaseView getBaseView();
}
