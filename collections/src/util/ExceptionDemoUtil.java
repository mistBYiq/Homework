package util;

import domain.Book;

import java.util.Set;

public class ExceptionDemoUtil {
    public static Book searchInBook(String string, Set<Book> books) {
        for (Book book : books) {
            if (book.getNameBook().contains(string)) {
                return book;
            }
        }
        throw new ResourceNotFoundExсeption(string + " Book was not found ");
    }
}
