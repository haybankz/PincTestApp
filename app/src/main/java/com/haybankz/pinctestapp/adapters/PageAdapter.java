package com.haybankz.pinctestapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.haybankz.pinctestapp.ui.BlankFragment;
import com.haybankz.pinctestapp.ui.QuestionsFragment;

public class PageAdapter extends FragmentPagerAdapter {

   private Context mContext;

    public PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new QuestionsFragment();
            case 1:
                return new BlankFragment();
            case 2:
                return new BlankFragment();
            case 3:
                return new BlankFragment();
            default:
                return new BlankFragment();

        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
       return null;

    }
}
