package com.ivanmagda.habito;

import com.ivanmagda.habito.models.Habit;
import com.ivanmagda.habito.models.HabitRecord;

import org.junit.Test;

import static org.junit.Assert.*;

public class HabitRecord_Test {

    @Test
    public void describeContents_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        assertEquals(h.describeContents(),0);
    }

    @Test
    public void HabitRecordConstructor_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        assertNotNull(h);
    }

    @Test
    public void copy_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        assertEquals(h.copy().getName(),h.getName());
    }

    @Test
    public void setUserId_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        h.setUserId("11");
        assertEquals(h.getUserId(),"11");
    }

    @Test
    public void setCreatedAt_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        h.setCreatedAt(11);
        assertEquals(h.getCreatedAt(),11);
    }

    @Test
    public void setName_Test() throws Exception {
        HabitRecord h = new HabitRecord();
        h.setName("TestName");
        assertEquals(h.getName(),"TestName");
    }

}
