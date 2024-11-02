package library.books;

import java.util.*;

public class BookManager {
    private List<Book> l=new ArrayList<>();
    public void add(Book book) {
        l.add(book);
    }
    public void remove(Book book) {
        l.remove(book);
    }

    private static BookManager bookManager;

    private BookManager(){}

    public static BookManager getBookManagerObj() {
        if(bookManager==null) {
            bookManager=new BookManager();
        }
        return bookManager;
    }
    public Book search(String inan) {
        Book book=null;
        for(Book b:l) {
            if (b.getIsbn().equals(inan) || b.getName().equals(inan))
            {
                book=b;
                break;
            }
        }
        return book;
    }
    public Book search(String isbn,String name) {
        Book book=null;
        for(Book b:l) {
            if (b.getIsbn().equals(isbn) && b.getName().equals(name))
            {
                book=b;
                break;
            }
        }
        return book;
    }
    public void display() {
        for(Book book:l) {
            System.out.println(book);
        }
    }
    public List<Book> getBookList(){
        return l;
    }
}