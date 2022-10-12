package by.kursy.annaburdys.javatasks.Classwork.Stage31.model;

import java.io.*;

public class B extends A implements Externalizable {
    public boolean flag;
    public int field;

    public B(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + ", flag=" + flag +
                ", field=" + field;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(id);
        out.writeDouble(value);
        out.writeBoolean(flag);
        out.writeInt(field);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();
        value = in.readDouble();
        flag = in.readBoolean();
        field = in.readInt();
    }
}