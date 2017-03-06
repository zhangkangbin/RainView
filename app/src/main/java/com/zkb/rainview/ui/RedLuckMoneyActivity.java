package com.zkb.rainview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zkb.rainview.R;
import com.zkb.rainview.base.BaseRainView;
import com.zkb.rainview.view.RedLuckMoneyView;

public class RedLuckMoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_red_luck_money);
        RedLuckMoneyView redLuckMoneyView= (RedLuckMoneyView) findViewById(R.id.red_luck_money);
        redLuckMoneyView.setOnClickView(new BaseRainView.ViewOnClick() {
            @Override
            public void onClick(String s) {

                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });

    }

}
