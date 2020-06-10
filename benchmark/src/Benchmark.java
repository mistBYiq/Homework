import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Задание бенчмарк (проверка производительности):
//1) Добавить 10-100 тысяч элементов в ArrayList and LinkedList
//2) Замерять время до удаления/добавления/измения в коллекции
//3) удалить/добавить/изменить элемент из середины коллекции
//4) замерять время окончания

public class Benchmark {
    
    public static void main(String[] args) {

        addArrayList(10_000);
        addLinkedList(10_000);

    }

    public static void addArrayList(int operations) {
        long start = System.nanoTime();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < operations; i++) {
            list.add("list" + i);
        }

        long finish = System.nanoTime();

        System.out.println("\n ArrayList: add " + operations + " elements. Time work : " + (finish - start) +
                " nanoseconds.  Average time for ONE item : " + (finish - start)/10_000.0 + " nanoseconds");

        int n = list.size();
        String test = list.get(n/2);
        String test2 = test + "test";


        long start2 = System.nanoTime();
        list.remove(test);
        long finish2 = System.nanoTime();
        System.out.println(" ArrayList: remove element from the middle. Time work : "+ (finish2 - start2) + " nanoseconds" );

        long start3 = System.nanoTime();
        list.add(n/2,test2);
        long finish3 = System.nanoTime();
        System.out.println(" ArrayList: add element in the middle. Time work : "+ (finish3 - start3) + " nanoseconds" );

        long start4 = System.nanoTime();
        list.set(n/2,test2);
        long finish4 = System.nanoTime();
        System.out.println(" ArrayList: set element in the middle. Time work : "+ (finish4 - start4) + " nanoseconds" );

    }

    public static void addLinkedList(int operations) {
        long start = System.nanoTime();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < operations; i++) {
            linkedList.add("linked" + i);
        }

        long finish = System.nanoTime();
        System.out.println("\n LinkedList: add " + operations + " elements. Time work : " + (finish - start) +
                " nanoseconds.  Average time for ONE item : " + (finish - start)/10_000.0 + " nanoseconds");

        int n = linkedList.size();
        String test = linkedList.get(n/2);
        String test2 = test + "test";

        long start2 = System.nanoTime();
        linkedList.remove(test);
        long finish2 = System.nanoTime();
        System.out.println(" LinkedList: remove element from the middle. Time work : "+ (finish2 - start2) + " nanoseconds" );

        long start3 = System.nanoTime();
        linkedList.add(n/2,test2);
        long finish3 = System.nanoTime();
        System.out.println(" LinkedList: add element in the middle. Time work : "+ (finish3 - start3) + " nanoseconds" );

        long start4 = System.nanoTime();
        linkedList.set(n/2,test2);
        long finish4 = System.nanoTime();
        System.out.println(" LinkedList: set element in the middle. Time work : "+ (finish4 - start4) + " nanoseconds" );
    }
}