package hibernate.entity;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="Books")
public class Book {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bid")
    private int id ;
    private String title;
    private String author;
    private int pages;
    @Column(name="book_name")
    private String bookName;
    @Temporal(TemporalType.DATE)
    private Date published;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
