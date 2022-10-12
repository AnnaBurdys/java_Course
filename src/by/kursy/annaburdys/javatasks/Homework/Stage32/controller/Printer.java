package by.kursy.annaburdys.javatasks.Homework.Stage32.controller;

public class Printer {
    public String text;
    public static synchronized void printTable(String text){//synchronized method
        for(int i=0; i<=text.length() - 1; i++){
            System.out.println(text.charAt(i));
            try{
                Thread.sleep(400);
            }catch(Exception e) {
                System.out.println(e);}
        }
    }
}
