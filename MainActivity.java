package com.example.unknownpatterncharactery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewDate = findViewById(R.id.textViewDate);

        try {
            Date last_day_of_2018 = getLastDayOf2018();
            SimpleDateFormat formatter = new SimpleDateFormat("Y");
            String formattedDate = formatter.format(last_day_of_2018);
            textViewDate.setText(formattedDate);
        } catch (IllegalArgumentException e) {
            textViewDate.setText(e.getMessage());
        }
    }

    private Date getLastDayOf2018() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 11, 31);
        return calendar.getTime();    }
}
