package jpa.db;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BookDBConfig {

     final private static EntityManagerFactory
                    ENTITY_MANAGER_FACTORY=getEmf();

    private BookDBConfig (){};

    private  static EntityManagerFactory getEmf(){
        return
                Persistence.createEntityManagerFactory("hibernate");
    };

    static public EntityManagerFactory getEntityManagerFactory()
    {
        return ENTITY_MANAGER_FACTORY;
    }

}
