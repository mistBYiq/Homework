import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        int i = 0;
        while(scanner.hasNext()){
            string = scanner.nextLine();
            System.out.println(++i + " " + string);
        }
        scanner.close();
    }
}
