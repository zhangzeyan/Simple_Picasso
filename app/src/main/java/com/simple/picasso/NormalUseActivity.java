package com.simple.picasso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by zhangzeyan on 16/10/18.
 */
public class NormalUseActivity extends Activity{

    private ImageView testImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_use);

        testImg = (ImageView) findViewById(R.id.testImg);

        Picasso.with(this).load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg").into(testImg);
    }
}
