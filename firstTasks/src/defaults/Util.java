package defaults;

public class Util {
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int EIGHT = 8;

    public static <T> void showArray(T[] array) {
        for (T t : array) {
            System.out.print(t + "  ");
        }
    }

}