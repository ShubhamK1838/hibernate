package jpa.db;

import hibernate.entity.Book;
import hibernate.entity.dao.BookDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class BookDaoImpl implements BookDao {

    private EntityManagerFactory emf;

    public BookDaoImpl() {
        this.emf = BookDBConfig.getEntityManagerFactory();
    }

    @Override
    public void add(Book book) {
        try (EntityManager factory = emf.createEntityManager()) {
            EntityTransaction tx = factory.getTransaction();
            tx.begin();
            factory.persist(book);
            tx.commit();

        }
    }

    @Override
    public void update(Book book) {
        try (EntityManager factory = emf.createEntityManager()) {
            EntityTransaction tx = factory.getTransaction();
            tx.begin();
            factory.merge(book);
            tx.commit();
        }
    }

    @Override
    public void delete(Book book) {
        try (EntityManager factory = emf.createEntityManager()) {
            EntityTransaction tx = factory.getTransaction();
            tx.begin();
            factory.remove(book);
            tx.commit();
        }
    }

    @Override
    public Book get(int id) {
        try (EntityManager factory = emf.createEntityManager()) {
            return factory.find(Book.class, id);
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

    @Override
    public void delete(int id) {
        Book book = get(id);
        delete(book);
    }
}
