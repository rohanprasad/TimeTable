package com.rohanprasad.timetable.item;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: This class contains the details of
 * a subject.
 *
 * Subject type: 0 - lecture.
 *               1 - Tutorial.
 *               2 - Practical.
 */
public class ItemSubject {

    String subjectCode;
    String subjectName;
    int subjectType;
    String professorName;
    boolean subjectSelected;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(int subjectType) {
        this.subjectType = subjectType;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public boolean isSubjectSelected() {
        return subjectSelected;
    }

    public void setSubjectSelected(boolean subjectSelected) {
        this.subjectSelected = subjectSelected;
    }


}
