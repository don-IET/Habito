package com.ivanmagda.habito;

import com.ivanmagda.habito.models.Habit;
import com.ivanmagda.habito.utils.ColorUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Habit_Test {
    @Test
    public void describeContents_Test() throws Exception {
        Habit h = new Habit();
        assertEquals(h.describeContents(),0);
    }
}