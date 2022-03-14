package main.java.com.mistiq.classwork.work_4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class BookUtil {

    static final String[] bookName = {"Мастер и Маргарита", "Над пропастью во ржи", "Маленький принц", "Вино из одуванчиков",
            "Анна Каренина", "Преступление и наказание", "Преступление и наказание", "Евгений Онегин", "Великий Гэтсби",
            "Бойцовский клуб", "Зелёная миля", "Герой нашего времени", "Война и мир", "Золотой телёнок",
            "Одиночество в Сети", "Властелин колец", "Трудно быть богом",
            "Хоббит, или Туда и обратно", "Старик и море", "Джейн Эйр", "Приключения Шерлока Холмса",
            "Пикник на обочине", "Автостопом по Галактике", "Кратчайшая история времени"};

    static Integer id = 0;

    public static Book generateDefaultBook() {
        return new Book();
    }

    public static Book generateBook() {
        Book book = new Book();
        book.setIdBook(id++);
        book.setNameBook(generateBookName());
        book.setAuthor(PersonUtil.generatePerson());
        return book;
    }

    public static Book[] generateBooks(int value) {
        Book[] books = new Book[value];
        for (int i = 0; i < books.length; i++) {
            books[i] = generateBook();
        }
        return books;
    }

    public static Integer generateIdBook() {
        return (int) (Math.random() * 1_000_000);
    }

    public static String generateBookName() {
        int length = bookName.length;
        int index = (int) (Math.random() * length);
        return bookName[index];
    }

    public static List<Book> generateListBooks(List<Book> books, int value) {
        for (int i = 0; i < value; i++) {
            books.add(generateBook());
        }
        return books;
    }

    public static Set<Book> generateSetWithDuplicate(Set<Book> books, int elements, int duplicate) {
        Book bookDefault = generateDefaultBook();

        for (int i = 0; i < (elements - duplicate); i++) {
            books.add(generateBook());
        }
        for (int i = (elements - duplicate); i < elements; i++) {
            books.add(bookDefault);
        }

        return books;
    }

    public static Book[] generateArrayBookWithDuplicate(int elements, int duplicate) {
        Book[] books = new Book[elements];
        Book bookDefault = generateDefaultBook();

        for (int i = 0; i < (elements - duplicate); i++) {
            books[i] = generateBook();
        }
        for (int i = (elements - duplicate); i < elements; i++) {
            books[i] = bookDefault;
        }

        return books;
    }

    public static Collection<Book> deleteElementCollection(Collection<Book> books, int index) {
        books.remove(index);
        return books;
    }

    public static List<Book> deleteElementList(List<Book> books, int index) {
        books.remove(index);
        return books;
    }

    public static void showBookArray(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public static void showBookList(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println();
    }

    public static void showBookSet(Set<Book> booksSet) {
        for (Book book : booksSet) {
            System.out.println(book);
        }
        System.out.println();
    }

    public static void showBooknameBeginsVowel(Set<Book> booksSet) {
        for (Book book : booksSet) {
            String string = book.getNameBook();
            if (string.matches("^(?ui:[аеёиоуыэюяaeiouy]).*")) {
                System.out.println(book);
            }
        }
    }

    public static void showSortBook(List<Book> books, String whatSort) {
        BookComparator comparator = new BookComparator(whatSort);

        Collections.sort(books, comparator);


        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}

class BookComparator implements Comparator<Book> {
    public static final String NAME = "NAME";
    public static final String LAST_NAME = "LAST_NAME";
    public static final String PATRONYMIC = "PATRONYMIC";

    String comparingBy;

    public BookComparator(String comparingBy) {
        this.comparingBy = comparingBy;
    }

    @Override
    public int compare(Book o1, Book o2) {
        switch (comparingBy) {
            case NAME:
                return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
            case LAST_NAME:
                return o1.getAuthor().getLastName().compareTo(o2.getAuthor().getLastName());
            case PATRONYMIC:
                return o1.getAuthor().getPatronymic().compareTo(o2.getAuthor().getPatronymic());
        }
        return 0;
    }
}