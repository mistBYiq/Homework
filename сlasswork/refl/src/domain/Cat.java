package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Cat extends Animal implements Comparable<Cat>, Serializable/*implements Comparator<Cat>*/ {

    public static final long serialVersionUID = 1L;

    public static int catCounter = 0;

    private transient Long catId = 10L;

    private transient String catName;

    private float weight = 7;

    private Date birthDate;

    public Cat() {
        super(4, 777L, 4);

//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            System.out.println("Gryaz'");
//        }

        //System.out.println("In constructor without params");
    }

    public Cat(long catId, String catName, float weight, Date birthDate) {
        super(4, 777L, 4);

        this.catId = catId;
        this.catName = catName;
        this.weight = weight;
        this.birthDate = birthDate;
        System.out.println("In constructor with params");
    }

    //Alt+Insert->Constructor
    //Alt+Insert->setter/Getter


    public static int getCatCounter() {
        return catCounter;
    }

    public static void setCatCounter(int catCounter) {
        Cat.catCounter = catCounter;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Date getBirthDate() {
        System.out.println(eyes);
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    //1. Overloaded method
    public void print(long i, Long j) {
        System.out.println("Some print");
    }

    //2. Overloaded method
    public int print(Double i, Long k) { //сигнатура метода = название + параметры (их тип + число + очередность)
        System.out.println("Some print");
        return 1;
    }

    //Ctrl+N

//    @Override
//    public int compare(Cat o1, Cat o2) {
//        return 0;
//    }

    @Override
    public boolean equals(Object o) {
        //1. Проверка на сравнение объекта с самим собой
        if (this == o) return true;
        //2. Сравниваем ли мы с null или мы сравниваем объекты разных классов
        if (o == null || getClass() != o.getClass()) return false;
        //3. Приведение типов перед сравнением по полям
        Cat cat = (Cat) o;
        return  Float.compare(cat.weight, weight) == 0 &&
                Objects.equals(catName, cat.catName) &&
                Objects.equals(birthDate, cat.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName, weight, birthDate);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cat{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Run like a cat!");
    }

    @Override
    public void jump() {
        System.out.println("Jump like a cat!");
    }

    @Override
    public void trainRunFaster() {
        System.out.println("Run training for cat!");
        weight--;
    }

    @Override
    public void trainJumpHigher() {
        System.out.println("Jump training for cat!");
        weight--;
    }

    @Override
    public int compareTo(Cat o) {
        if (this.getWeight() > o.getWeight()) {
            return 1;
        } else {
            if (this.getWeight() < o.getWeight()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
