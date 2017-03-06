package com.zkb.rainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zkb.rainview.ui.CirleActivity;
import com.zkb.rainview.ui.RainActivity;
import com.zkb.rainview.ui.RedLuckMoneyActivity;
import com.zkb.rainview.ui.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){

        findViewById(R.id.btn_luckmoney).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, RedLuckMoneyActivity.class));
            }
        });
        findViewById(R.id.btn_rain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RainActivity.class));
            }
        });

        findViewById(R.id.btn_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TextViewActivity.class));
            }
        });

        findViewById(R.id.btn_cirle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CirleActivity.class));
            }
        });

    }
}
