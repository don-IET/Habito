package com.ivanmagda.habito.utils;

public final class ColorUtils {

    public static String parseColorFromInt(int colorInt) {
        String hexString = Integer.toHexString(colorInt);
        return  hexString;
    }

    private ColorUtils() {
    }

}
