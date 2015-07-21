package com.rohanprasad.timetable.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Auther: Rohan Prasad.
 * Date: 21 Jul 2015
 * <p/>
 * Description: This model stores the schedule
 */

@Table(name = "Schedule")
public class TableSchedule extends Model {

    @Column(name = "subject")
    String subject;

    @Column(name = "day")
    int day;

    @Column(name = "startTime")
    long startTime;

    @Column(name = "endTime")
    long endTime;

    public TableSchedule() {
        super();
    }

    public TableSchedule(String subject, int day, long startTime, long endTime) {
        super();
        this.subject = subject;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }


}
