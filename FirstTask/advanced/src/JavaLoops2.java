import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a + b;
            int temp = 2;
            for (int j = 1; j <= n; j++) {
                System.out.print(result + " ");
                result = result + b * (int) Math.pow(temp,j);
            }
            System.out.println();
        }
        in.close();
    }
}
