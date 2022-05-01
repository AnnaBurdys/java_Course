package by.kursy.annaburdys.javatasks.Classwork.Stage14.model.Logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        int a = 10;
        int b = 3;
        int expected = 13;

        int actual = Calculator.sum(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testSub() {
        int a = 10;
        int b = 3;
        int expected = 7;

        int actual = Calculator.sub(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testMul() {
        int a = 10;
        int b = 3;
        int expected = 30;

        int actual = Calculator.mul(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testDiv() {
        int a = 10;
        int b = 3;
        int expected = 3;

        int actual = Calculator.div(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        int a = 10;
        int b = 0;

        Calculator.div(a,b);
    }


    @Test (timeout = 2000)
    public void testMulByTimeout() {

        int a = 10;
        int b = 3;

        Calculator.mul(a,b);

        }
    }