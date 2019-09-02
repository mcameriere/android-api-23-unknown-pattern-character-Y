package com.samples.unkownpatterncharactery;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void lastDayOf2018_isWeek1_of2019() {
        SimpleDateFormat formatter = new SimpleDateFormat("Y"); // 'Y' = Week Year
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,11,31);
        Date last_day_of_2018 = calendar.getTime();
        String formattedDate = formatter.format(last_day_of_2018);
        assertEquals("2019", formattedDate);
    }
}
