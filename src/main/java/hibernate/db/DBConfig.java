package hibernate.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;

public class DBConfig {

    private DBConfig(){}

    private  final static
                SessionFactory SESSION_FACTORY =buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        return  new Configuration().configure("configurationways/config-xml.xml").buildSessionFactory();

    }
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }

}
