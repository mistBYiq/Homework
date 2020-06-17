package util;

import domain.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static util.PersonUtil.generatePerson;
import static util.PersonUtil.random;

public class StudentUtil {
    static Long id = 0L;

    public static Student generateStudent() {
        Student student = new Student();
        student.setIdStudent(generateId());
        student.setCourse(generateCourse());
        student.setStudent(generatePerson());

        return student;
    }

    public static Student[] generateStudentArray(int count) {
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i] = generateStudent();
        }
        return students;
    }

    public static Long generateId() {
        return id++;
    }

    public static Integer generateCourse() {
        return  random(1,5);
    }

    public static Map<Long, Student> generateStudentMap(int count) {
        HashMap<Long, Student> studentMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            Student student = generateStudent();
            studentMap.put(student.getIdStudent(),student);
        }

        return studentMap;
    }

    public static void removeOddIdStudent(Set<Student> studentSet) {
        studentSet.removeIf(student -> (student.getIdStudent() % 2) != 0);
    }

    public static Set<Student> removeOddId(Set<Student> set) {
        Iterator<Student> iterator = set.iterator();
        while ( iterator.hasNext()) {
            Student student = iterator.next();
            if ((student.getIdStudent() % 2) != 0 ) {
                iterator.remove();
            }
        }
        return set;
    }
    public static Set<Student> generateStudentSet(int count) {
        Set<Student> studentSet = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            studentSet.add(generateStudent());

        }

        return studentSet;
    }

    public static void showStudentArray(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void showStudentSet(Set<Student> studentSet) {
        for (Student student : studentSet) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void showMapStudent(Map<Long, Student> studentMap) {
        for (Map.Entry<Long, Student> student : studentMap.entrySet()) {
            Long key = student.getKey();
            System.out.println(key);
            Student value = student.getValue();
            System.out.println(value);
        }
    }

}
