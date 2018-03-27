package com.rs.uidemo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 重写ViewPager 以实现可左右滚动和不可左右滚动
 * 屏蔽滑动：onInterceptTouchEvent/onTouchEvent
 * 屏蔽滑动效果：setCurrentItem(int item, boolean smoothScroll)
 *
 * Created by RS on 2018/3/27.
 */

public class MyViewPager extends ViewPager {

    private boolean scrollable = true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollable(boolean scrollable) {
        this.scrollable = scrollable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return scrollable && super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return scrollable && super.onTouchEvent(ev);
    }

    /**
     * 如果设置了不可滑动，取消滑动的效果
     * @param item
     */
    @Override
    public void setCurrentItem(int item) {
        if (this.scrollable)
            super.setCurrentItem(item);
        else
            super.setCurrentItem(item, false);
    }
}
