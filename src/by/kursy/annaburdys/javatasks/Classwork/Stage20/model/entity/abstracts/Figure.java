package by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.abstracts;

import java.util.Objects;

public abstract class Figure {
    protected int x;
    protected int y;

    protected Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Figure() {
        x = 0;
        y = 0;
    }

    public abstract void draw();

    public String toString() {
        return "x = " + x + " y = " + y;
    }

    public double calculatePerimeter(){
       return 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Figure figure = (Figure) obj;
        if (x == figure.x && y == figure.y) {
            return true;
        } else return false;
    }

}