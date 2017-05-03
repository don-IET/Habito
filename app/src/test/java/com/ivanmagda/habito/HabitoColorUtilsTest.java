package com.ivanmagda.habito;

import com.ivanmagda.habito.utils.ColorUtils;
import com.ivanmagda.habito.utils.HabitoStringUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HabitoColorUtilsTest {
    @Test
    public void parseColorFromInt_Test() throws Exception {
        assertEquals(ColorUtils.parseColorFromInt(170),"aa");
    }
}
