package main.java.com.mistiq.homework.collections.domain;

public class Book {

    private Integer idBook;
    private String nameBook;
    private Person author;

    {
        idBook = 1;
        nameBook = "Lock, Stock and Two Smoking Barrels";
        author = new Person();
    }

    public Book() {

    }

    public Book(Integer idBook, String nameBook, Person author) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getIdBook() != null ? !getIdBook().equals(book.getIdBook()) : book.getIdBook() != null) return false;
        if (getNameBook() != null ? !getNameBook().equals(book.getNameBook()) : book.getNameBook() != null)
            return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdBook() != null ? getIdBook().hashCode() : 0;
        result = 31 * result + (getNameBook() != null ? getNameBook().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", author=" + author +
                '}';
    }
}
