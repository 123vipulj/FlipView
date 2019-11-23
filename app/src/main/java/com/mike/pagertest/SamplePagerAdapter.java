package com.mike.pagertest;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SamplePagerAdapter extends FragmentStatePagerAdapter {

    List<String> mItems = new ArrayList<>();

    public SamplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(mItems.get(position));
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    public void setItems(List<String> list) {
        mItems = list;
        notifyDataSetChanged();
    }
}
