package com.android.renly.plusclub_rn.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.renly.plusclub_rn.module.base.BaseFragment;

import java.util.List;

/**
 * 主页切换Adapter
 */

public class MainPageAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> fragments;

    public MainPageAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
