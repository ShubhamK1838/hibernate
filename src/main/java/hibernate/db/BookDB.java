package hibernate.db;

import hibernate.entity.Book;
import hibernate.entity.dao.BookDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class BookDB implements BookDao {


    private SessionFactory sessionFactory;

    public BookDB()
    {
        sessionFactory = DBConfig.getSessionFactory();
    }

    public void setSessionFactory()
    {
        this.sessionFactory = DBConfig.getSessionFactory();
    }
    @Override
    public void add(Book book) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(book);
            tx.commit();
        }
    }


    @Override
    public void update(Book book) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(book);
            tx.commit();
        }
    }

    @Override
    public void delete(Book book) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.remove(book);
            tx.commit();
        }
    }

    @Override
    public void delete(int id )
    {
        Book book = get(id);
        if(book != null)
        {
            delete(book);
        }
    }

    @Override
    public Book  get(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Book.class, id);
        }
    }

    @Override
    public List<Book> get(String autor) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
