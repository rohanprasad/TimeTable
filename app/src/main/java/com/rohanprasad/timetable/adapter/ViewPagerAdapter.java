package com.rohanprasad.timetable.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.rohanprasad.timetable.fragment.FragmentSchedule;
import com.rohanprasad.timetable.helper.HelperFunctions;

/**
 * Auther: Rohan Prasad.
 * Date: 21 Jul 2015
 * <p/>
 * Description: ViewPagerAdapter for schedule.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    // List of all tab titles.
    CharSequence titles[];
    Context context;

    public ViewPagerAdapter(Context context, FragmentManager fragmentManager, CharSequence titles[]) {
        super(fragmentManager);

        this.context = context;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {

        FragmentSchedule schedule = new FragmentSchedule();
        schedule.setData(HelperFunctions.getSchedule(position));

        return schedule;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
