package main.java.com.mistiq.homework.collections;


import main.java.com.mistiq.homework.collections.domain.Book;
import main.java.com.mistiq.homework.collections.domain.Good;
import main.java.com.mistiq.homework.collections.domain.Student;
import main.java.com.mistiq.homework.collections.util.BookUtil;
import main.java.com.mistiq.homework.collections.util.GoodUtil;
import main.java.com.mistiq.homework.collections.util.StudentUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static final String NAME = "NAME";
    public static final String LAST_NAME = "LAST_NAME";
    public static final String PATRONYMIC = "PATRONYMIC";

    public static void main(String[] args) {

        //1. Create an instance of the LinkedList class, place 20 objects of the Book class in it.
        //   Display information about all books. Programmatically delete the 7th book from the collection,
        //   display information on the remaining books.
        System.out.println("  ========== part 1 ==========");

        Book[] generatedBooks = BookUtil.generateBooks(20);

        List<Book> bookLinkedList = new LinkedList<>();
        Collections.addAll(bookLinkedList, generatedBooks);

        BookUtil.showBookList(bookLinkedList);
        System.out.println("elements in LinkedList = " + bookLinkedList.size());

        BookUtil.deleteElementList(bookLinkedList, 7);
        System.out.println();
        BookUtil.showBookList(bookLinkedList);
        System.out.println("elements in LinkedList after deleting an item = " + bookLinkedList.size());

        //2. Create an instance of the HashSet class, add 25 instances of the Book class to it,
        // provide for at least 6 identical books.
        // Display information about books (contained in the HashSet collection),
        // the name of which begins with a vowel.
        System.out.println("  ========== part 2 ==========");

        Book[] books = BookUtil.generateArrayBookWithDuplicate(25, 6);
        BookUtil.showBookArray(books);
        System.out.println("elements in array with duplicate = " + books.length);

        Set<Book> bookHashSet = new HashSet<>();
        Collections.addAll(bookHashSet, books);
        BookUtil.showBookSet(bookHashSet);
        System.out.println("elements in HashSet = " + bookHashSet.size());

        System.out.println("Bookname of which begins with a vowel");
        BookUtil.showBooknameBeginsVowel(bookHashSet);

        // 3. Sort a collection of 25 books by last name,
        // then first name,
        // middle name of the author of the book (these fields must be added to the Book class).
        System.out.println("  ========== part 3 ==========");

        List<Book> booksArrayList = new ArrayList<>();
        BookUtil.generateListBooks(booksArrayList, 25);
        BookUtil.showBookList(booksArrayList);

        System.out.println("sort by last name");
        BookUtil.showSortBook(booksArrayList, LAST_NAME);
        System.out.println("sort by name");
        BookUtil.showSortBook(booksArrayList, NAME);
        System.out.println("sort by patronymic");
        BookUtil.showSortBook(booksArrayList, PATRONYMIC);

        //4. Create an instance of the TreeSet class,
        // place objects of the Student class in it (you need to design it).
        // Display information on each even student in the list,
        // remove each odd student from the collection.
        System.out.println("  ========== part 4 ==========");
        System.out.println("Add students in TreeSet");

        Set<Student> studentTreeSet = StudentUtil.generateStudentSet(20);
        StudentUtil.showStudentSet(studentTreeSet);
        System.out.println();

        StudentUtil.removeOddIdStudent(studentTreeSet);
        System.out.println("TreeSet After remove each odd id students");
        StudentUtil.showStudentSet(studentTreeSet);

        // 5. Task to work with Map'a. Add 15 objects of class Good
        System.out.println("  ========== part 5 ==========");
        Map<Long, Good> map = GoodUtil.generateTreeMapGood(15);
        GoodUtil.showMapGoods(map);

        System.out.println();

        Map<String, String> maps = GoodUtil.generateHashMapGood(15);
        GoodUtil.showMapGood(maps);
    }
}
