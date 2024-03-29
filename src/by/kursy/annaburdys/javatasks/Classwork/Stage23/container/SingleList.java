package by.kursy.annaburdys.javatasks.Classwork.Stage23.container;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

class FlowerNode {
    public Flower value;
    public FlowerNode next;
}

public class SingleList implements Container {
    private FlowerNode first;

    public SingleList(){
        first = new FlowerNode();
    }

    public SingleList(Flower[] flowers){
        first = new FlowerNode();
        FlowerNode temp = first;

        for (int i = 0; i < flowers.length - 1; i++) {
            temp.value = flowers[i];
            temp.next = new FlowerNode();
            temp = temp.next;
        }

        temp.value = flowers[flowers.length - 1];
        temp.next = null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size(){
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public Flower get(int index) {
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            if (index == count) {
                break;
            }

            temp = temp.next;
            count++;
        }

        return temp.value;
    }

    @Override
    public void set(int index, Flower flower) {
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            if (index == count) {
                break;
            }

            temp = temp.next;
            count++;
        }

        temp.value = flower;
    }

    public void add(Flower flower){
        FlowerNode temp = first;

        if (first.value == null) {
            first.value = flower;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        FlowerNode node = new FlowerNode();
        node.value = flower;
        temp.next = node;
    }

    public void remove(int index) {
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            count++;

            if (index == count) {
                FlowerNode prev = temp;
                temp = temp.next;
                prev.next = temp;
                break;
            }

            temp = temp.next;
        }

    }



}