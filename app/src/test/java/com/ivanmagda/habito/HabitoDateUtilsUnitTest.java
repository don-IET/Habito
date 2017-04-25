package com.ivanmagda.habito;

import com.ivanmagda.habito.utils.HabitoDateUtils;
import com.ivanmagda.habito.models.ResetFrequency;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HabitoDateUtilsUnitTest {

    private Date d1;    // 2017. 04. 01.
    private Date d2;    // 2017. 04. 25.
    private Date d3;    // 2017. 04. 26.

    private Date current;
    private Date old;   // 2016. 04. 25.

    @Before
    public void init() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        current = calendar.getTime();
        calendar.set(2017, 4, 1);
        d1 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        d2 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        d3 = calendar.getTime();
        calendar.set(2016, 4, 25);
        old = calendar.getTime();
    }

    @Test
    public void isWithinRange_Date_test() {
        assertTrue(HabitoDateUtils.isWithinRange(d2, d1, d3));
    }

    @Test
    public void isWithinRange_long_test() {
        assertTrue(HabitoDateUtils.isWithinRange(d2.getTime(), d1.getTime(), d3.getTime()));
    }

    @Test
    public void isDateInCurrentWeek_test() {
        assertTrue(HabitoDateUtils.isDateInCurrentWeek(current.getTime()));
        assertFalse(HabitoDateUtils.isDateInCurrentWeek(old.getTime()));
    }

    @Test
    public void isDatesInSameWeek_test() {
        assertFalse(HabitoDateUtils.isDatesInSameWeek(d1.getTime(), d2.getTime()));
        assertTrue(HabitoDateUtils.isDatesInSameWeek(d2.getTime(), d3.getTime()));
    }

    @Test
    public void isDateInCurrentMonth_test() {
        assertTrue(HabitoDateUtils.isDateInCurrentMonth(current.getTime()));
        assertFalse(HabitoDateUtils.isDateInCurrentMonth(old.getTime()));
    }

    @Test
    public void isDatesInSameMonth_test() {
        assertTrue(HabitoDateUtils.isDatesInSameMonth(d1.getTime(), d2.getTime()));
        assertFalse(HabitoDateUtils.isDatesInSameMonth(d1.getTime(), old.getTime()));
    }

    @Test
    public void isDateInCurrentYear_test() {
        assertTrue(HabitoDateUtils.isDateInCurrentYear(current.getTime()));
        assertFalse(HabitoDateUtils.isDateInCurrentYear(old.getTime()));
    }

    @Test
    public void isDateInType_Week_test() {
        assertTrue(HabitoDateUtils.isDateInType(current.getTime(), ResetFrequency.Type.WEEK));
        assertFalse(HabitoDateUtils.isDateInType(old.getTime(), ResetFrequency.Type.WEEK));
    }

    @Test
    public void isDateInType_Year_test() {
        assertTrue(HabitoDateUtils.isDateInType(current.getTime(), ResetFrequency.Type.YEAR));
        assertFalse(HabitoDateUtils.isDateInType(old.getTime(), ResetFrequency.Type.YEAR));
    }

    @Test
    public void isDateInType_Never_test() {
        assertTrue(HabitoDateUtils.isDateInType(old.getTime(), ResetFrequency.Type.NEVER));
    }

    @Test
    public void isSameDay_test(){
        assertTrue(HabitoDateUtils.isSameDay(d1.getTime(), d1.getTime()));
        assertFalse(HabitoDateUtils.isSameDay(d1.getTime(), d2.getTime()));
    }
}
