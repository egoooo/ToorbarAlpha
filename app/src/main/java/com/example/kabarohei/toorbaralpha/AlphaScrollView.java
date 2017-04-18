package com.example.kabarohei.toorbaralpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by kabarohei on 17/4/18.
 */

public class AlphaScrollView extends ScrollView {
    public static final String TAG = "AlphaTitleScrollView";
    private int mSlop;
    private LinearLayout toolbar;
    private ImageView headView;
    public AlphaScrollView(Context context) {
        super(context);
        init();
    }

    public AlphaScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AlphaScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mSlop=5;
    }

    public void findToorbarAndHeadPic(LinearLayout toolbar,ImageView headView){
        this.toolbar=toolbar;
        this.headView=headView;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        float headHeight=headView.getMeasuredHeight()-toolbar.getMeasuredHeight();
        int alpha= (int) (((float)t/headHeight)*255);
        if (alpha >= 255)
            alpha = 255;
        if (alpha <= mSlop)
            alpha = 0;
        toolbar.getBackground().setAlpha(alpha);
        super.onScrollChanged(l, t, oldl, oldt);
    }
}
