public class Demo {

    public static void main(String[] args) {

        int[] arrayInt = Util.createdArrayInt(); //{7, 13, 42, 2, -3, 2, -11, 2, 27, 15, 15, -42,};
        int[] arrayInt2 = Util.createdArrayInt(); //{8, 4, 2, 7, -2, 58};
        String[] arrayStrings = Util.createdArrayStrings();//{"DD", "WW", "KK", "EE", "AA", "aa", "dd", "ww", "WW", "kk", "ee"};
        String[] arrayStrings2 = Util.createdArrayStrings();//{"MM", "JJ", "KK", "OO", "AA", "se", "id", "cr", "HH", "kp", "ele" };

        Task.task01(arrayInt, arrayStrings);
        Task.task02(arrayInt);
        Task.task04(arrayInt);
        Task.task05(arrayInt);

        Task.task06(arrayInt);
        Task.task07(arrayInt);
        Task.task08(arrayInt);
        Task.task09(arrayInt);
        Task.task10(arrayInt);

        Task.task11(arrayInt);
        Task.task12(arrayInt);
        Task.task13(arrayStrings);
        Task.task14(arrayStrings,arrayStrings2);
        Task.task15(arrayInt, arrayInt2);

        Task.task16(arrayInt);
        Task.task17(arrayInt);
        Task.task18(arrayInt);
        Task.task19();
        Task.task20(arrayStrings);
    }
}
