package Sample_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.age - o2.age;
    }

}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        return o1.name.compareTo(o2.name);
    }

}

public class Sorting_using_Interfaces {
    public static void main(String args[]) {
        Student s1 = new Student(24, "Maha");
        Student s2 = new Student(10, "Raj");
        Student s3 = new Student(20, "Mohan");

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        // Before Sorting
        for (Student s : list) {
            System.out.println(s.age + " - " + s.name);
        }

        System.out.println("After Sorting By Age: ");
        // After Sorting
        Collections.sort(list, new AgeComparator());
        for (Student s : list) {
            System.out.println(s.age + " - " + s.name);
        }

        System.out.println("After Sorting By Name: ");
        // After Sorting
        Collections.sort(list, new NameComparator());
        for (Student s : list) {
            System.out.println(s.age + " - " + s.name);
        }
    }
}
