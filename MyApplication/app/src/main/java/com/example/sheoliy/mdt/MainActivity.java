package com.example.sheoliy.mdt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements OnClickListener {
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mFragments;
    private LinearLayout mTabNew;
    private LinearLayout mTabLearn;
    private LinearLayout mTabLive;
    private LinearLayout mTabSettings;
    private ImageButton mImgnew;
    private ImageButton mImglearn;
    private ImageButton mImglive;
    private ImageButton mImgsettings;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
        setSelect(0);
    }

    private void initEvent() {
        mTabNew.setOnClickListener(this);
        mTabLearn.setOnClickListener(this);
        mTabLive.setOnClickListener(this);
        mTabSettings.setOnClickListener(this);
    }



    private void initView() {
        mViewPager = (ViewPager)findViewById(R.id.id_viewpager);
        mTabNew = (LinearLayout)findViewById(R.id.id_tab_new);
        mTabLearn = (LinearLayout)findViewById(R.id.id_tab_learn);
        mTabLive = (LinearLayout)findViewById(R.id.id_tab_live);
        mTabSettings = (LinearLayout)findViewById(R.id.id_tab_settings);
        mImgnew = (ImageButton)findViewById(R.id.id_tab_new_img);
        mImglearn = (ImageButton)findViewById(R.id.id_tab_learn_img);
        mImglive = (ImageButton)findViewById(R.id.id_tab_live_img);
        mImgsettings = (ImageButton)findViewById(R.id.id_tab_settings_img);

        mFragments = new ArrayList<Fragment>();
        Fragment mTab01 = new NewFragment();
        Fragment mTab02 = new LearnFragment();
        Fragment mTab03 = new LiveFragment();
        Fragment mTab04 = new SettingFragment();

        mFragments.add(mTab01);
        mFragments.add(mTab02);
        mFragments.add(mTab03);
        mFragments.add(mTab04);
        mAdapter = new FragmentPagerAdapter(this.getSupportFragmentManager()) {
            public int getCount() {

                return mFragments.size();
            }

            public Fragment getItem(int arg0) {
                return mFragments.get(arg0);
            }
        };
        mViewPager.setAdapter(this.mAdapter);
        mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
            public void onPageSelected(int arg0) {
                int currentItem = mViewPager.getCurrentItem();
                setTab(currentItem);
            }

            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.id_tab_new:
                setSelect(0);
                break;
            case R.id.id_tab_learn:
                setSelect(1);
                break;
            case R.id.id_tab_live:
                setSelect(2);
                break;
            case R.id.id_tab_settings:
                setSelect(3);
                break;
        }

    }

    private void setSelect(int i) {
        //设置图片为亮色
        //切换内容区域
        setTab(i, R.drawable.new_pressed, R.drawable.learn_pressed, R.drawable.live_pressed, R.drawable.settings_pressed);
        mViewPager.setCurrentItem(i);
    }

    private void setTab(int i, int new_pressed, int learn_pressed, int live_pressed, int settings_pressed) {
        resetImgs();
        switch (i) {
            case 0:
                mImgnew.setImageResource(R.drawable.new_pressed);
                break;
            case 1:
                mImglearn.setImageResource(R.drawable.learn_pressed);
                break;
            case 2:
                mImglive.setImageResource(R.drawable.live_pressed);
                break;
            case 3:
                mImgsettings.setImageResource(R.drawable.settings_pressed);
        }
    }

    private void setTab(int i) {
        setTab(i, R.drawable.new_pressed, R.drawable.learn_pressed, R.drawable.live_pressed, R.drawable.settings_pressed);

    }

    private void resetImgs() {
        mImgnew.setImageResource(R.drawable.new_normal);
        mImglearn.setImageResource(R.drawable.learn_normal);
        mImglive.setImageResource(R.drawable.live_normal);
        mImgsettings.setImageResource(R.drawable.settings_normal);
    }
}
