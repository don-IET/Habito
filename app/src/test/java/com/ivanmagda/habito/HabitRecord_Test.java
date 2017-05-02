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
}
