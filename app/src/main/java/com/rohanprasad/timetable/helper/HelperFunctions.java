package com.rohanprasad.timetable.helper;

import android.content.Context;
import android.content.SharedPreferences;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.rohanprasad.timetable.item.ItemSubject;
import com.rohanprasad.timetable.models.TableSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: This class contains the functions which can be
 * used at many instances.
 */
public class HelperFunctions {

    // Returns the subject list from db.
    public static ArrayList<ItemSubject> getSubjectList() {

        List<TableSubject> subjects = new Select()
                .from(TableSubject.class)
                .execute();

        ArrayList<ItemSubject> mData = new ArrayList<>();

        for (int i = 0; i < subjects.size(); i++) {
            ItemSubject item = new ItemSubject();
            TableSubject source = subjects.get(i);

            item.setSubjectName(source.name);
            item.setSubjectCode(source.code);
            item.setProfessorName(source.professorName);
            item.setSubjectType(source.subjectType);
            item.setSubjectSelected(source.selected);

            mData.add(item);
        }

        return mData;
    }

    // Save the list of subjects currently selected. Remove
    // all entries from the table and insert new entries.
    public static void saveSubjectSelection(ArrayList<ItemSubject> mData) {

        new Delete().from(TableSubject.class).execute();

        ActiveAndroid.beginTransaction();

        try {
            for (int i = 0; i < mData.size(); i++) {

                ItemSubject item = mData.get(i);
                TableSubject dataItem = new TableSubject(item.getSubjectName(),
                        item.getSubjectCode(),
                        item.getProfessorName(),
                        item.getSubjectType(),
                        item.isSubjectSelected());

                dataItem.save();
            }

            ActiveAndroid.setTransactionSuccessful();
        } finally {
            ActiveAndroid.endTransaction();
        }

    }

    public static void addSubject(String subjectName, String subjectCode, String professorName, int type){

        TableSubject dataItem = new TableSubject(subjectName,
                subjectCode,
                professorName,
                type,
                false);

        dataItem.save();
    }

    public static SharedPreferences getSharedPref(Context context){

        return context.getSharedPreferences("Timetable",Context.MODE_PRIVATE);
    }

}
