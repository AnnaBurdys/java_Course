package by.kursy.annaburdys.javatasks.Homework.Stage14.Task01;

public class FigureModel {
    public static String calculatePossibilityForFigure1(int x1, int y1, int x2, int y2) {
        return ((x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2)) ? "YES" : "NO";
    }

    public static String calculatePossibilityForFigure2(int x1, int y1, int x2, int y2) {
        return ( x1 == x2 && Math.abs(y1 - y2) == 1)  ||  (y1 == y2 && Math.abs(x1 - x2) == 1) ? "YES" : "NO";
    }

    public static String calculatePossibilityForFigure3(int x1, int y1, int x2, int y2) {
        return (Math.abs(x2 - x1) == Math.abs(y2 - y1) && x1 != x2 && y1 != y2 ) ? "YES" : "NO";
    }

    public static String calculatePossibilityForFigure4(int x1, int y1, int x2, int y2) {
        return (   calculatePossibilityForFigure1(x1, y1, x2, y2).equals("YES")
                || calculatePossibilityForFigure2(x1, y1, x2, y2).equals("YES")
                || calculatePossibilityForFigure3(x1, y1, x2, y2).equals("YES") ) ? "YES" : "NO";
    }

    public static String calculatePossibilityForFigure5(int x1, int y1, int x2, int y2) {
        return (((x2 == x1 - 1 || x2 == x1 + 1) && (y2 == y1 - 2 || y2 == y1 + 2))
                || ((x2 == x1 - 2 || x2 == x1 + 2) && (y2 == y1 - 1 || y2 == y1 + 1))
        ) ? "YES" : "NO";
    }
}