package by.kursy.annaburdys.javatasks.Classwork.Stage23.container;

public abstract class AbstractContainer implements Container {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
