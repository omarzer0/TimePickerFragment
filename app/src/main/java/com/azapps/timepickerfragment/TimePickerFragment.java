package com.azapps.timepickerfragment;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        boolean is24Format = DateFormat.is24HourFormat(getActivity());
        // params
        // (context,
        // OnTimeSetListener but we da not want to implement it here because we need the data in another activity
        // default hour to be shown (make it the device current hour)
        // default minutes to be shown (make it the device current minutes)
        // boolean indicates whether the device is 24 hours or 12 hours format
        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), hour,minute,is24Format);
    }
}
