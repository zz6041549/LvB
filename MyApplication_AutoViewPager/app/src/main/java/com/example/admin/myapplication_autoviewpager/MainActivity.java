package com.example.admin.myapplication_autoviewpager;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private int[] pics = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4};
    private BannerViewpagerAdapter adapter;
    private BannerViewpagerChangeListener changeListener;
    private static final int SHOW_NEXT_PAGE = 0;
    private int page = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == SHOW_NEXT_PAGE) {
                showNextPage();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.vp);
        adapter = new BannerViewpagerAdapter(this, pics);
        changeListener = new BannerViewpagerChangeListener();
        viewPager.setCurrentItem(viewPager.getAdapter().getCount() / 2);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(changeListener);
    }

    private void showNextPage() {
        if(page > pics.length - 1){
            page = 0;
        }
    }

}
