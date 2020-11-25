package com.example.winit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class calendarActivity extends AppCompatActivity {
    CalendarView calendar_widget;
    TextView date_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        calendar_widget = (CalendarView)
                findViewById(R.id.calendar_widget);
        date_view = (TextView)
                findViewById(R.id.date_view);

        // Add Listener in calendar
        calendar_widget
                .setOnDateChangeListener(
                        new CalendarView
                                .OnDateChangeListener() {
                            @Override

                            // In this Listener have one method
                            // and in this method we will
                            // get the value of DAYS, MONTH, YEARS
                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {

                                String Date
                                        = dayOfMonth + "-"
                                        + (month + 1) + "-" + year;

                                date_view.setText(Date);
                            }
                        });
    }
}
