package com.rohanprasad.timetable;

import android.app.Application;
import android.content.SharedPreferences;

import com.activeandroid.ActiveAndroid;
import com.rohanprasad.timetable.helper.HelperFunctions;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: The application class for this app.
 */
public class TimeTableApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);

        SharedPreferences sharedPreferences = HelperFunctions.getSharedPref(this);
        if(sharedPreferences.getBoolean("firstRun", true)){

            HelperFunctions.addSubject("DATABASE MANAGEMENT SYSTEMS", "EC-451","Dr. Chidansh Bhatt", 0);
            HelperFunctions.addSubject("COMPUTER NETWORKS LAB", "EC-473","Dr. S.Gangopadhyay", 2);
            HelperFunctions.addSubject("FIELD TRAINING", "EC-491","Dr. Vaskar Raychoudhary", 2);
            HelperFunctions.addSubject("NETWORK PROGRAMMING IN UNIX", "EC-552","Dr. Manoj Mishra", 0);
            HelperFunctions.addSubject("INFORMATION AND NETWORK SECURITY", "CSN-513","Dr. A.K.Sirje", 0);
            HelperFunctions.addSubject("UNDERSTANDING EARTHQUAKE AND HAZARDS DISASTER", "IEQ-03","Dr. __", 0);
            HelperFunctions.addSubject("INNOVATION, BUSINESS MODELS AND ENTERPRENEURSHIP", "IBM-08","Dr. __", 0);
            HelperFunctions.addSubject("ADVANCED OS", "EC-551","Dr. Rajdeep Niyogi", 0);

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("firstRun", false);
            editor.commit();
        }
    }
}
