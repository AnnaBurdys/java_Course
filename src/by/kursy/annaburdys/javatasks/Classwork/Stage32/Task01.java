package by.kursy.annaburdys.javatasks.Classwork.Stage32;

public class Task01 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("id = " + thread.getId());
        System.out.println("name = " + thread.getName());
        thread.setName("My main Thread");
        System.out.println("name = " + thread.getName());
        System.out.println("Priority = " + thread.getPriority());
        System.out.println("Thread group = " + thread.getThreadGroup());
        System.out.println("Thread state = " + thread.getState());
        System.out.println("is alive = " + thread.isAlive());
    }
}
