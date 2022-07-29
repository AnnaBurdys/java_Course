package by.kursy.annaburdys.javatasks.Classwork.Stage28.model;

import java.io.*;

public class CharWorker {
    public static void write(String fileName) {
        Writer stream = null;

        try {
            stream = new FileWriter("/Users/annaburdys/Desktop/test.bin");
            for (int i = 0; i < 100; i++) {
                stream.write(i);
            }
            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }
    }

    public static String read(String fileName) {
        Reader stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileReader("/Users/annaburdys/Desktop/test.bin");
            int number = stream.read();

            while((number != -1))  {
                builder.append(number).append(" ");
                number = stream.read();
            }

        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }
        return builder.toString();
    }
}
