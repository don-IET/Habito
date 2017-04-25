package com.ivanmagda.habito;

import com.ivanmagda.habito.utils.HabitoStringUtils;

import org.junit.Test;

import static junit.framework.Assert.assertSame;
import static org.junit.Assert.assertEquals;


public class HabitoStringUtilsUnitTest {
    @Test
    public void capitalized_Test() throws Exception {
        assertEquals(HabitoStringUtils.capitalized("testString"),"TestString");
    }
}
