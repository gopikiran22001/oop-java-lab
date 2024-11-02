package library.books;
 public class Book {
     private String name,isbn,author;
     private int publishyear;
     private boolean isavailable;

     public Book(){}

     public Book(String name, String isbn, String author, int publishyear, boolean isavailable) {
         this.name = name;
         this.isbn = isbn;
         this.author = author;
         this.publishyear = publishyear;
         this.isavailable = isavailable;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getIsbn() {
         return isbn;
     }

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public int getPublishyear() {
         return publishyear;
     }

     public void setPublishyear(int publishyear) {
         this.publishyear = publishyear;
     }

     public boolean isIsavailable() {
         return isavailable;
     }

     public void setIsavailable(boolean isavailable) {
         this.isavailable = isavailable;
     }
     public String toString() {
         return "Book [ Name:"+name+", Author:"+author+", ISBN:"+isbn+", Published Year:"+publishyear+", IsAvailableP:"+isavailable+" ]";
     }
 }