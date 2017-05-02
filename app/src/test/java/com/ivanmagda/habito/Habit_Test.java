package com.ivanmagda.habito;

import com.ivanmagda.habito.models.Habit;
import com.ivanmagda.habito.models.HabitRecord;
import com.ivanmagda.habito.utils.ColorUtils;

import org.junit.Test;

import static org.junit.Assert.*;


public class Habit_Test {
    @Test
    public void describeContents_Test() throws Exception {
        Habit h = new Habit();
        assertEquals(h.describeContents(),0);
    }

    @Test
    public void getId_Test() throws Exception {
        Habit h = new Habit();
        h.setId("11");
        assertEquals(h.getId(),"11");
    }

    @Test
    public void setId_Test() throws Exception {
        Habit h = new Habit();
        h.setId("12");
        assertNotNull(h.getId());
    }

    @Test
    public void getRecord_Test() throws Exception {
        Habit h = new Habit();
        assertNotNull(h.getRecord());
    }

    @Test
    public void setRecord_Test() throws Exception {
        Habit h = new Habit();
        h.setRecord(new HabitRecord());
        assertNotNull(h.getRecord());
    }

    @Test
    public void isReminderOff_Test() throws Exception {
        Habit h = new Habit();
        assertFalse(h.isReminderOn());
    }

    @Test
    public void isReminderOn_Test() throws Exception {
        Habit h = new Habit();
        HabitRecord hr = new HabitRecord();
        hr.setReminderHour(11);
        hr.setReminderMin(11);
        h.setRecord(hr);
        assertTrue(h.isReminderOn());
    }




}
