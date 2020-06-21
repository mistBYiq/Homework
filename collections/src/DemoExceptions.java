import domain.Book;
import util.BookUtil;
import util.ExceptionDemoUtil;

import java.util.Set;

public class DemoExceptions {
    public static void main(String[] args) {
        Set<Book> bookSet = BookUtil.generateSetBook(10);
        BookUtil.showBookSet(bookSet);

        try {
            Book book = ExceptionDemoUtil.searchInBook("Автостопом по Галактике", bookSet);
            System.out.println(book);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
