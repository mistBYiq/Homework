import domain.Book;
import util.BookUtil;
import util.ExceptionDemoUtil;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class DemoExceptions {
    public static void main(String[] args) throws IOException {
        Set<Book> bookSet = BookUtil.generateSetBook(10);
        BookUtil.showBookSet(bookSet);
        FileWriter writer = new FileWriter("src/resources/log.txt");

        try {
            Book book = ExceptionDemoUtil.searchInBook("Автостопом по Галактике", bookSet);
            System.out.println(book);
        } catch (Exception e) {
            writer.write(e.getMessage() + "\n");
            writer.flush();
            writer.close();
            System.out.println(e.getMessage());
        }

        FileReader logRead = new FileReader("src/resources/log.txt");
        Scanner scanner = new Scanner(logRead);
        int i = 1; //for number of lines
        System.out.println("Read log.txt");

        while (scanner.hasNextLine()) {
            System.out.println(i + " : " + scanner.nextLine());
            i++;
        }
        scanner.close();
        logRead.close();
    }
}
