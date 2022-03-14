package main.java.com.mistiq.homework.collections.util;


import main.java.com.mistiq.homework.collections.domain.Good;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GoodUtil {
    static final String ABC = "_- 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    static final String[] CATEGORY = {"auto", "computers and networks", "construction and repair",
            "A house and a garden", "beauty and sport", "children and mothers", "work and office"};

    static SecureRandom random = new SecureRandom();

    static Long id = 1L;
    static Double price = 1.1;

    public static String randomString(int len) {
        StringBuilder stringBuilder = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            stringBuilder.append(ABC.charAt(random.nextInt(ABC.length())));
        return stringBuilder.toString();
    }

    public static Good generateGood() {
        Good good = new Good();

        good.setIdGood(generateId());
        good.setCategory(generateCategory());
        good.setNameGood(randomString(10));
        good.setSalesman(randomString(5));
        good.setPrice(generatePrice());
        good.setQuantityGoodsStock(generateGoodsStock());

        return good;
    }

    public static Long generateId() {
        return id++;
    }

    public static String generateCategory() {
        int length = CATEGORY.length;
        int index = (int) (Math.random() * length);
        return CATEGORY[index];
    }

    public static Double generatePrice() {
        return (price * (Math.random() * 10));
    }

    public static Integer generateGoodsStock() {
        return (int) (Math.random() * 10);
    }

    public static Good[] generateGoods(int count) {
        Good[] goods = new Good[count];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = generateGood();
        }

        return goods;
    }

    public static List<Good> generateListGood(int count) {
        List<Good> goods = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            goods.add(i, generateGood());
        }

        return goods;
    }

    public static Set<Good> generateSetGood(int count) {
        Set<Good> goods = new HashSet<>();
        for (int i = 0; i < count; i++) {
            goods.add(generateGood());
        }

        return goods;
    }

    public static Map<Long, Good> generateTreeMapGood(int count) {
        Map<Long, Good> goods = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            Good good = generateGood();
            goods.put(good.getIdGood(), good);
        }

        return goods;
    }

    public static Map<String, String> generateHashMapGood(int count) {
        Map<String, String> goods = new HashMap<>();
        for (int i = 0; i < count; i++) {
            Good good = generateGood();
            goods.put(good.getNameGood(), good.getSalesman());
        }

        return goods;
    }

    public static Map<Long, Good> addMapKeyIdValueGood(Map<Long, Good> goodMap, Good good) {
        goodMap.put(good.getIdGood(), good);
        return goodMap;
    }

    public static Map<String, String> addMapGood(Map<String, String> goodMap, Good good) {
        goodMap.put(good.getNameGood(), good.getSalesman());
        return goodMap;
    }

    public static void showArrayGoods(Good[] goods) {
        for (Good good : goods) {
            System.out.println(good);
        }
    }

    public static void showListGoods(List<Good> goods) {
        for (Good good : goods) {
            System.out.println(good);
        }
    }

    public static void showSetGoods(Set<Good> goods) {
        for (Good good : goods) {
            System.out.println(good);
        }
    }

    public static void showMapGood(Map<String, String> goods) {
        for (Map.Entry<String, String> entry : goods.entrySet()) {
            String key = entry.getKey();
            System.out.print(key + " : ");
            String value = entry.getValue();
            System.out.println(value);
        }
    }

    public static void showMapGoods(Map<Long, Good> goods) {
        for (Map.Entry<Long, Good> good : goods.entrySet()) {
            Long key = good.getKey();
            System.out.print(key + " : ");
            Good value = good.getValue();
            System.out.println(value);
        }
    }
}