package by.kursy.annaburdys.javatasks.Classwork.Stage31.model;

import by.kursy.annaburdys.javatasks.Classwork.Stage30.model.User;

import java.io.*;

public class Serializer {
    private static String file = "/Users/annaburdys/Desktop/a.bin";

    public static void serialize(A a) {
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(file)))) {

            stream.writeObject(a);

            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static A deserialize() {
        A a = null;
        try (ObjectInputStream stream =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(file)))) {

            a = (A)stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }
        return a;
    }
}
