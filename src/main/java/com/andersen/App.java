package com.andersen;

import com.andersen.entity.User;
import com.andersen.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("222");
        user.setLastName("222");

        session.save(user);
        session.getTransaction().commit();

    }

}
