package com.haybankz.pinctestapp.ui;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.haybankz.pinctestapp.R;
import com.haybankz.pinctestapp.adapters.PageAdapter;


public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    EditText searchEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchEditText = (EditText) findViewById(R.id.et_search);
        Typeface font = Typeface.createFromAsset(getAssets(), "Avenir-Medium.ttf");
        searchEditText.setTypeface(font);


        viewPager = (ViewPager) findViewById(R.id.view_pager);

        PageAdapter simpleFragmentPagerAdapter =
                new PageAdapter( getSupportFragmentManager(), this);


        viewPager.setAdapter(simpleFragmentPagerAdapter);
        viewPager.setCurrentItem(0);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);

        int[] tabImages = {R.drawable.ic_icon_home, R.drawable.ic_icon_users,
                R.drawable.ic_icon_bell, R.drawable.ic_action_user_grey};

        for (int i = 0; i < tabLayout.getTabCount() - 1; i++){
            (tabLayout.getTabAt(i)).setIcon(tabImages[i]);
        }

        tabLayout.getTabAt(tabLayout.getTabCount() -1).setIcon(tabImages[tabImages.length - 1]);
    }


    @Override
    protected void onResume() {
        super.onResume();
        viewPager.requestFocus();
    }
}
