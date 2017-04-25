package com.ivanmagda.habito;

import com.ivanmagda.habito.utils.HabitoDateUtils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class HabitoDateUtilsUnitTest {

    @Test
    public void isWithinRange_Date_test()  {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 4, 25);
        Date d = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date start = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        Date end = calendar.getTime();

        assertTrue(HabitoDateUtils.isWithinRange(d, start, end));
    }

    @Test
    public void isWithinRange_long_test(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 4, 25);
        Date d = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date start = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        Date end = calendar.getTime();

        assertTrue(HabitoDateUtils.isWithinRange(d.getTime(),start.getTime(),end.getTime()));
    }

    @Test
    public void isDateInCurrentWeek_test() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 4, 25);
        assertFalse(HabitoDateUtils.isDateInCurrentWeek(calendar.getTime().getTime()));
    }

    @Test
    public void isDatesInSameWeek_test(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 4, 25);
        Date d1 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        Date d2 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date d3 = calendar.getTime();
      
        assertTrue(HabitoDateUtils.isDatesInSameWeek(d1.getTime(), d2.getTime()));
        assertFalse(HabitoDateUtils.isDatesInSameWeek(d1.getTime(), d3.getTime()));
    }
}
