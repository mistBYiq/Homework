package main.java.com.mistiq.homework.six_inner_class;

public class Temp {

    public final static String FINAL_STRING = "Final var";
    public static int valueStatic = 7;
    public double value = 36.6;

    class Inner {
        public void print() {
            System.out.println("inner classes CANNOT contain field STATIC except final static");
        }
    }

    static class Nested {

    }

    SomeInterface someInterface = new SomeInterface() {
        @Override
        public void methodSomeInterface() {
            System.out.println("This happens in an anonymous class ");
        }
    }; // }; important!!!

    public void methodOuterClass() {
        System.out.println("Method Outer Class");
        class classInsideMethod {
            int a = 42;
        }
    }
}
