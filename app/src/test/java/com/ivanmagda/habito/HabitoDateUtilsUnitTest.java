package com.ivanmagda.habito;

import com.ivanmagda.habito.utils.HabitoDateUtils;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class HabitoDateUtilsUnitTest {

    @Test
    public void isWithinRange_Date_test() throws Exception {
        Date d = new Date(2017, 4, 25);
        Date start = new Date(2017, 4, 1);
        Date end = new Date(2017, 4, 30);
        assertTrue(HabitoDateUtils.isWithinRange(d, start, end));
    }

    @Test
    public void isWithinRange_long_test() throws Exception {
        Date d = new Date(2017, 4, 25);
        Date start = new Date(2017, 4, 1);
        Date end = new Date(2017, 4, 30);
        assertTrue(HabitoDateUtils.isWithinRange(d.getTime(),start.getTime(),end.getTime()));
    }

    @Test
    public void isDateInCurrentWeek_test() {
        Date d = new Date(2016, 4, 25);
        assertFalse(HabitoDateUtils.isDateInCurrentWeek(d.getTime()));
    }

    @Test
    public void isDatesInSameWeek_test(){
        Date d1 = new Date(2017, 4, 25);
        Date d2 = new Date(2017, 4, 25);
        Date d3 = new Date(2017, 4, 1);
        assertTrue(HabitoDateUtils.isDatesInSameWeek(d1.getTime(), d2.getTime()));
        assertFalse(HabitoDateUtils.isDatesInSameWeek(d1.getTime(), d3.getTime()));
    }
}
