package by.kursy.annaburdys.javatasks.Classwork.Stage26;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        /*Random random = new Random();
        int size = 20;
        int bound = 20;

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(bound);
            set.add(number);
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(set);*/

        Set<Student> set = new TreeSet<>();
/*       Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());*/


        set.add(new Student("Alex2", 10, 2));
        set.add(new Student("Alex1", 11, 3));
        set.add(new Student("Alex3", 12, 4));
        set.add(new Student("Alex4", 13, 5));


        view(set);
    }

    public static void view(Iterable<Student> iterable) {
        for (Student st : iterable) {
            System.out.println(st);
        }
    }
}