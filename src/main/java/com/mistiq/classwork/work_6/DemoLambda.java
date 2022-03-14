package main.java.com.mistiq.classwork.work_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. Получить уникальные строки
//2. Вывести строки длиной больше 10
//3. Вывести получаемую строку в upperCAse and LowerCase
public class DemoLambda {
    public static void main(String[] args) {
        List<String> listForStreams = Arrays.asList("a1AAASS", "aDDD2", "aA2", "aSSJJJJJJaA3");
        Stream<String> stringStream = listForStreams.stream();

        stringStream.filter(s -> s.length() > 10).forEach(System.out::println);
        System.out.println("================================");
        listForStreams.stream()
                .map(s -> {
                    System.out.println(s.toUpperCase());
                    System.out.println(s.toLowerCase());
                    return s.toUpperCase();
                }).collect(Collectors.toList());

//        stringStream.map(s -> {
//            return s.toLowerCase();
//        }).collect(Collectors.toList());
//
//        stringStream.map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
