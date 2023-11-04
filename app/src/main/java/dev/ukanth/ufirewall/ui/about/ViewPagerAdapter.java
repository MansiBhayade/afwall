package dev.ukanth.ufirewall.ui.about;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ukanth on 2/5/15.
 */
public class ViewPagerAdapter extends FragmentStateAdapter {

    CharSequence[] pageTitles;
    int noOfTabs;


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentActivity fm,  CharSequence[] mTitles , int mNumbOfTabsumb) {
        super(fm);
        this.pageTitles = mTitles;
        this.noOfTabs = mNumbOfTabsumb;

    }
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) {
            return new AboutFragment();
        } else {
            return new FAQFragment();
        }
    }
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }

    @Override
    public int getItemCount() {
        return noOfTabs;
    }
}
