package by.kursy.annaburdys.javatasks.Homework.Stage14.Task01;

import by.kursy.annaburdys.javatasks.view.Printer;

import java.util.Scanner;

import static by.kursy.annaburdys.javatasks.Homework.Stage14.Task01.FigureModel.calculatePossibilityForFigure1;
import static by.kursy.annaburdys.javatasks.Homework.Stage14.Task01.FigureModel.calculatePossibilityForFigure2;
import static by.kursy.annaburdys.javatasks.Homework.Stage14.Task01.FigureModel.calculatePossibilityForFigure3;
import static by.kursy.annaburdys.javatasks.Homework.Stage14.Task01.FigureModel.calculatePossibilityForFigure4;
import static by.kursy.annaburdys.javatasks.Homework.Stage14.Task01.FigureModel.calculatePossibilityForFigure5;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Menu\n");
        Printer.print("Choose your figure:\n");
        Printer.print("1. Castle\n2. King\n3. Bishop\n4. Queen\n5. Knight");
        Printer.print("\nChoose a figure: ");
        int figure = scanner.nextInt();
        Printer.print("\nEnter x1: ");
        int x1 = scanner.nextInt();
        Printer.print("\nEnter y1: ");
        int y1 = scanner.nextInt();
        Printer.print("\nEnter x2: ");
        int x2 = scanner.nextInt();
        Printer.print("\nEnter y2: ");
        int y2 = scanner.nextInt();
        String result = "";
        switch (figure) {
            case 1:
                result = calculatePossibilityForFigure1(x1, y1, x2, y2);
                break;
            case 2:
                result = calculatePossibilityForFigure2(x1, y1, x2, y2);
                break;
            case 3:
                result = calculatePossibilityForFigure3(x1, y1, x2, y2);
                break;
            case 4:
                result = calculatePossibilityForFigure4(x1, y1, x2, y2);
                break;
            case 5:
                result = calculatePossibilityForFigure5(x1, y1, x2, y2);
                break;
            default:
                result = "Error";
        }
        String msg = (result.equals("YES")) ? "\nThat move is possible" : "\nThis move is not possible";
        System.out.println(msg);
    }
}