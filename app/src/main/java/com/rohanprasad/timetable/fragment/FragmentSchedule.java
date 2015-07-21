package com.rohanprasad.timetable.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rohanprasad.timetable.R;
import com.rohanprasad.timetable.models.TableSchedule;

import java.util.ArrayList;

/**
 * Auther: Rohan Prasad.
 * Date: 21 Jul 2015
 * <p/>
 * Description:
 */
public class FragmentSchedule extends Fragment {


    ArrayList<TableSchedule> schedules;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        ListView lvSchedule = (ListView) view.findViewById(R.id.lv_schedule);

        return view;
    }

    public void setData(ArrayList<TableSchedule> schedules) {
        this.schedules = schedules;
    }
}
