package com.ivanmagda.habito.utils;

public final class ColorUtils {

    public static String parseColorFromInt(int colorInt) {
        return Integer.toHexString(colorInt);
    }

    private ColorUtils() {
    }

}
