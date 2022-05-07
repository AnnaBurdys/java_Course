package by.kursy.annaburdys.javatasks.Homework.Stage14.Task01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FigureModelTest {
    @Test
    public void testCastleNo() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 3;
        int y2 = 5;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure1(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCastleYes() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 1;
        int y2 = 4;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure1(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCastleBorderNo() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 7;
        int y2 = 7;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure1(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCastleBorderYes() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure1(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCastleNoMove() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 4;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure1(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKingNo() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 3;
        int y2 = 5;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure2(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKingYes() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 4;
        int y2 = 3;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure2(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKingBorderNo() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 7;
        int y2 = 3;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure2(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKingBorderYes() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 2;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure2(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKingNoMove() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure2(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testBishopNo() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 3;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure3(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testBishopYes() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 4;
        int y2 = 2;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure3(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testBishopBorderNo() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 4;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure3(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testBishopBorderYes() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 8;
        int y2 = 6;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure3(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testBishopNoMove() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 4;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure3(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testQueenNo() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure4(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testQueenYes() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 7;
        int y2 = 5;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure4(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testQueenBorderYes() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure4(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testQueenBorderNo() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 5;
        int y2 = 2;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure4(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }
    @Test
    public void testQueenNoMove() {
        int x1 = 6;
        int y1 = 4;
        int x2 = 6;
        int y2 = 4;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure4(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKnightNo() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 6;
        int y2 = 3;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure5(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKnightYes() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 5;
        int y2 = 7;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure5(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKnightBorderNo() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 5;
        int y2 = 3;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure5(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKnightBorderYes() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 1;
        int y2 = 7;
        String expected = "YES";

        String actual = FigureModel.calculatePossibilityForFigure5(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    public void testKnightNoMove() {
        int x1 = 3;
        int y1 = 6;
        int x2 = 3;
        int y2 = 6;
        String expected = "NO";

        String actual = FigureModel.calculatePossibilityForFigure5(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }


}