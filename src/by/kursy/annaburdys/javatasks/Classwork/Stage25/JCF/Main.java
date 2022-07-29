package by.kursy.annaburdys.javatasks.Classwork.Stage25.JCF;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        //LinkedList list = new LinkedList();
        //HashSet list = new HashSet();
/*        TreeSet<String> list = new TreeSet<>();
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        list.add("e");
        test(list);*/

        CustomCollection collection = new CustomCollection(); // CustomCollection = букет цветов, team
        collection.add(45);
        collection.add(5);
        collection.add(3);

        System.out.println(collection);
        System.out.println(justDoIt(collection));
    }

/*    public static void view(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }*/

    public static int justDoIt(CustomCollection collection) {
        int sum = 0;
        for (int element : collection) {
            sum += element;
        }
        return sum;
    }

}