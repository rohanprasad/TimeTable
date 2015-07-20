package com.rohanprasad.timetable.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.rohanprasad.timetable.R;
import com.rohanprasad.timetable.adapter.AdapterSubjectList;
import com.rohanprasad.timetable.helper.HelperFunctions;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: This activity will display a list of subjects that
 *              can be chosen by an individual.
 */
public class SubjectSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_selection);

        ListView subjectList = (ListView) findViewById(R.id.lv_subject_selection);
        final AdapterSubjectList adapterSubjectList = new AdapterSubjectList(SubjectSelectionActivity.this, R.layout.layout_item_subject_selection, HelperFunctions.getSubjectList());

        subjectList.setAdapter(adapterSubjectList);

        Button saveSelection = (Button) findViewById(R.id.btn_subject_save);
        saveSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelperFunctions.saveSubjectSelection(adapterSubjectList.getSubjectSelection());
            }
        });
    }
}
