package com.rohanprasad.timetable.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: Model for subjects table.
 */

@Table(name = "Subject")
public class TableSubject extends Model {

    @Column(name = "Name")
    public String name;

    @Column(name = "Code")
    public String code;

    @Column(name = "Selected")
    public Boolean selected;

    @Column(name = "Type")
    public int subjectType;

    @Column(name = "Professor")
    public String professorName;

    public TableSubject() {
        super();
    }

    public TableSubject(String subjectName, String subjectCode, String professorName, int subjectType, boolean isSelected) {

        super();
        this.name = subjectName;
        this.code = subjectCode;
        this.professorName = professorName;
        this.subjectType = subjectType;
        this.selected = isSelected;
    }
}
