package com.Persistence;

import com.util.CommonUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import static com.util.CommonUtil.cast;

//TODO

/**
 * why sessionMannager close the session automaticly?
 */
@Component
public class SessionMannager {

    private static ThreadLocal session = new ThreadLocal();

    @Resource
    private SessionFactory sessionFactory;

    public Session getCurrentSession() throws HibernateException {
        Session currentSession = cast(session.get());
        if (CommonUtil.isNull(currentSession)) {
            currentSession = sessionFactory.getCurrentSession();
            session.set(currentSession);
        }
        return currentSession;
    }

    public void closeSession() throws HibernateException {
        Session currentSession = cast(session.get());
        if (CommonUtil.isnotNull(currentSession)) {
            currentSession.close();
        }
    }

}
