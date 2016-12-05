package com.example.admin.myapplication_autoviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 2016/12/5.
 */

public class BannerViewpagerAdapter extends PagerAdapter {
    private int[] pics;
    private Context context;

    public BannerViewpagerAdapter(Context context, int[] pics) {
        this.pics = pics;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
