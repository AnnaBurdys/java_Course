import org.junit.Test;
import org.junit.Assert;

public class SimpleTest {
    /// AAA
    @Test
    public void test() {
        // Arrange
        int a = 11;
        int b = 20;
        int expected = 30;

        // Action
        int actual = a + b;

        // Assert
        if (expected != actual) {
            Assert.fail();
        }
    }
}
