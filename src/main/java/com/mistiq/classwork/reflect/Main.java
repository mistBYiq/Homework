package main.java.com.mistiq.classwork.reflect;

public class Main {
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;

//        System.out.println(catClass.getName());
//        System.out.println(catClass.getCanonicalName());
//        System.out.println(catClass.getClassLoader());
//        System.out.println(catClass.getPackageName());
//
//        System.out.println(catClass.getAnnotations());
//        System.out.println(catClass.getSuperclass());
//
//        System.out.println(catClass.getModifiers());
//
//        int animalModifiers = Animal.class.getModifiers();
//        System.out.println(Animal.class.getModifiers());
//        System.out.println(Modifier.toString(Animal.class.getModifiers()));
//
//        System.out.println(Modifier.isStatic(animalModifiers));
//        System.out.println(Modifier.isAbstract(animalModifiers));
//        System.out.println(Modifier.isPublic(animalModifiers));
//        System.out.println(Modifier.isPrivate(animalModifiers));

        Cat cat = new Cat();
        Class<? extends Cat> catClass1 = cat.getClass();


    }
}
