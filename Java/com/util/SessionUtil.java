package com.util;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;

public class SessionUtil {

    private static final String SESSION_KEY = "";

    public static void setSessionUser(HttpServletRequest request, SessionUser sessionUser) {
        request.getSession().setAttribute(SESSION_KEY, sessionUser);

    }

    public static SessionUser getSessionUser(final HttpServletRequest request) {

        if (!Objects.isNull(request.getSession().getAttribute(SESSION_KEY))) {

            return (SessionUser) request.getSession().getAttribute(SESSION_KEY);
        }
        return null;
    }

    public static void removeSessionUser(HttpServletRequest request) {
        request.getSession().removeAttribute(SESSION_KEY);
    }


    public static boolean isLogin(HttpServletRequest request) {

        return CommonUtil.isnotNull(getSessionUser(request));
    }
}
