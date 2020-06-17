package util;

import domain.Good;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GoodUtil {
    static final String ABC = "_- 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    static final String[] CATEGORY = {"auto", "computers and networks", "construction and repair",
            "A house and a garden", "beauty and sport", "children and mothers", "work and office"};

    static SecureRandom random = new SecureRandom();

    static Long id = 0L;
    static Double price = 1.1;

    public static String randomString(int len) {
        StringBuilder stringBuilder = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
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

    public static List<Good> generateListGoods(List<Good> goods, int count) {
        for (int i = 0; i < count; i++) {
            goods.add(generateGood());
        }
        return goods;
    }

    public static Set<Good> generateSetGoods(Set<Good> goods, int count) {
        for (int i = 0; i < count; i++) {
            goods.add(generateGood());
        }
        return goods;
    }

    public static Map<Long, Good> generateMapGoods(Map<Long,Good> goodMap, int count) {
        for (int i = 0; i < count; i++) {
            Good good = generateGood();
            goodMap.put(good.getIdGood(), good);
        }
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

    public static void showMapGoods(Map<Long, Good> goods) {
        for (Map.Entry<Long, Good> good : goods.entrySet()) {
            Long key = good.getKey();
            System.out.println(key);
            Good value = good.getValue();
            System.out.println(value);
        }
    }
}