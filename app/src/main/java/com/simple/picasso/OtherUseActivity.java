package com.simple.picasso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by zhangzeyan on 16/10/19.
 */
public class OtherUseActivity extends Activity {

    private ImageView firstImg, secondImg, thirdImg, fourImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other_use);

        firstImg = (ImageView) findViewById(R.id.firstImg);
        secondImg = (ImageView) findViewById(R.id.secondImg);
        thirdImg = (ImageView) findViewById(R.id.thirdImg);
        fourImg = (ImageView) findViewById(R.id.fourImg);


        Picasso.with(this)
                .load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg")
                .resize(500, 500)
                .into(firstImg);


        Picasso.with(this)
                .load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg")
                .resize(500, 500)
                .centerCrop()
                .into(secondImg);


        Picasso.with(this)
                .load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg")
                .transform(new CropSquareTransformation())
                .into(thirdImg);


        /**
         * 增加加载中图片和默认图片
         */
        Picasso.with(this)
                .load("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg")
                .placeholder(R.mipmap.loading)
                .error(R.mipmap.defalut)
                .into(fourImg);



    }
}
