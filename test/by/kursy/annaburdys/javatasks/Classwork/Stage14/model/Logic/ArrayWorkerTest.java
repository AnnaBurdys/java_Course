package by.kursy.annaburdys.javatasks.Classwork.Stage14.model.Logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
// [1, 2, 3, 4, 5] --> [5, 4, 3, 2, 1]
// [1, 2, 3, 4, 5, 6] --> [6, 5, 4, 3, 2, 1]
// [1] --> [1]
// [1, 2] --> [2, 1]
// [3, 3, 3] --> [3, 3, 3]
// [] --> []
// null --> Exception

public class ArrayWorkerTest {
    @Test
    public void testReverseOdd() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);

        }
    }

    @Test
    public void testReverseEven() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);

        }
    }

    @Test
    public void testReverseOne() {
        int[] array = {1};
        int[] expected = {1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);

        }
    }

    @Test
    public void testReverseTwo() {
        int[] array = {1, 2};
        int[] expected = {2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);

        }
    }

    @Test
    public void testReverseSame() {
        int[] array = {3, 3, 3};
        int[] expected = {3, 3, 3};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], array[i]);

        }
    }

    @Test
    public void testReverseEmpty() {
        int[] array = {};

        ArrayWorker.reverse(array);
        assertEquals(array.length, 0);
        }

    @Test
    public void testReverseNull() {
        ArrayWorker.reverse(null);
    }
}