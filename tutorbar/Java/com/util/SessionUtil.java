package com.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * Created by bryan on 2017/7/13.
 * the util class of session
 * make all the methods static,
 * which is conveniet to use
 * for other classes
 */
public class SessionUtil {
    private static String SESSION_KEY = "";

    public static void setSessionUser(HttpServletRequest request, SessionUser sessionUser) {
        request.getSession().setAttribute(SESSION_KEY, sessionUser);

    }

    public static SessionUser getSessionUser(HttpServletRequest request) {
        if (!Objects.isNull(request.getSession().getAttribute(SESSION_KEY))) {

            return (SessionUser) request.getSession().getAttribute(SESSION_KEY);
        }
        return null;
    }

    public static void removeSessionUser(HttpServletRequest request) {
        request.getSession().removeAttribute(SESSION_KEY);
    }


    public static boolean isLogin(HttpServletRequest request) {

        return getSessionUser(request) == null ? false : true;
    }
}
