package hibernate.entity.dao;

import hibernate.entity.Book;

public interface BookDao {

    public void add(Book book );
    public void update(Book book);
    public void delete(Book book );
    public Book  get(int id);
    public java.util.List<Book> get(String autor);
    public java.util.List<Book> getAll();
    public void delete( int id  );
}
