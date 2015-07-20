package com.rohanprasad.timetable.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.rohanprasad.timetable.R;
import com.rohanprasad.timetable.item.ItemSubject;

import java.util.ArrayList;

/**
 * Auther: Rohan Prasad.
 * Date: 20 Jul 2015
 * <p/>
 * Description: This is the array adapter which will be used to
 * populate the list view containing the list of subjects
 * which will be displayed in the timetable.
 */
public class AdapterSubjectList extends ArrayAdapter<ItemSubject> {

    //Store the data and context for future use.
    ArrayList<ItemSubject> mData;
    Context context;

    public AdapterSubjectList(Context context, int resource, ArrayList<ItemSubject> objects) {
        super(context, resource, objects);

        this.mData = objects;
        this.context = context;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolderItem viewHolder;

        if (convertView == null) {

            //Get layout inflater and inflate the item layout.
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.layout_item_subject_selection, parent, false);

            viewHolder = new ViewHolderItem();
            viewHolder.tvSubjectName = (TextView) convertView.findViewById(R.id.tv_subject_name);
            viewHolder.tvSubjectCode = (TextView) convertView.findViewById(R.id.tv_subject_code);
            viewHolder.cbSubjectSelection = (CheckBox) convertView.findViewById(R.id.cb_subject_selection);

            viewHolder.cbSubjectSelection.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    mData.get(position).setSubjectSelected(isChecked);
                }
            });

            // Store the holder with the view.
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        ItemSubject currentItem = mData.get(position);

        viewHolder.tvSubjectCode.setText(currentItem.getSubjectCode());
        viewHolder.tvSubjectName.setText(currentItem.getSubjectName());
        viewHolder.cbSubjectSelection.setChecked(currentItem.isSubjectSelected());

        return convertView;
    }

    static class ViewHolderItem {

        TextView tvSubjectCode;
        TextView tvSubjectName;
        CheckBox cbSubjectSelection;
    }

    public ArrayList<ItemSubject> getSubjectSelection(){
        return this.mData;
    }


}
