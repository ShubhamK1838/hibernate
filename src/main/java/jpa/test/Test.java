package jpa.test;

import hibernate.entity.Book;
import hibernate.entity.dao.BookDao;
import jpa.db.BookDaoImpl;

public class Test {
    public static void main(String[] args) {

        BookDao dao=new BookDaoImpl();

        Book book = dao.get(1);
        System.out.println( book );

        
    }
}
