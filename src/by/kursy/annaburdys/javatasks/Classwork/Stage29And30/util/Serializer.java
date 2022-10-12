package by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util;

import by.kursy.annaburdys.javatasks.Classwork.Stage31.model.A;

import java.io.*;

public class Serializer<T> {
    private static String file = "/Users/annaburdys/Desktop/a.bin";

    public static String getFile() {
        return file;
    }

    public static void setFile(String file) {
        Serializer.file = file;
    }

    public void serialize(T t) {
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(file)))) {

            stream.writeObject(t);

            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public T deserialize() {
        T t = null;
        try (ObjectInputStream stream =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(file)))) {

            t = (T)stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }
        return t;
    }
}
