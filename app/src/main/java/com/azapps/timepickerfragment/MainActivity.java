package com.azapps.timepickerfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.openTimePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here i use a timePicker which i made
                TimePickerFragment pickerFragment = new TimePickerFragment();
                pickerFragment.show(getSupportFragmentManager(),"1");
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // here i can get the data (hours and minutes back from my fragment
        TextView showTimePicked = findViewById(R.id.showTimePicked);
        showTimePicked.setText("Hours: "+hourOfDay +"\n"+ "Minutes: "+minute);
    }
}