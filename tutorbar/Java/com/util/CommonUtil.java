package com.util;

public class CommonUtil {

    public static boolean isNull(Object object) {

        return object == null ? true : false;
    }

    public static boolean isnotNull(Object object) {
        return object == null ? false : true;
    }

    public static <E> E cast(Object object) {
        return (E) object;
    }


}
