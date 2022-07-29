package by.kursy.annaburdys.javatasks.Classwork.Stage27;

public class Test {
    public void main(String[] args) {
/*        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.printf("%d / %d = %d", a, b, c);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }

        int[] array = {1,2,3,4,5};
        int index = 10;
        try{
            System.out.println(array[index]);
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error! Index out of bounds");
        }*/

        A a = new A();

       /* try{
            B b = (B) a;
        } catch (ClassCastException exception) {
            System.out.println(exception);
        }*/

        if (a instanceof B) {
            B b = (B) a;
        } else  {
            System.out.println("Error");
        }


    }

    class A {

    }

    class B extends A {

    }

    class C extends A {

    }

    class D {

    }

}
