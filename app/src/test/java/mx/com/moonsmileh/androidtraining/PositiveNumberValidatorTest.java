package mx.com.moonsmileh.androidtraining;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PositiveNumberValidatorTest {
    PositiveNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new PositiveNumberValidator();
    }

    @Test
    public void testNegative() {
        boolean result = SUT.isPositive(-1);
        Assert.assertFalse(result);
    }

    @Test
    public void testZero() {
        boolean result = SUT.isPositive(0);
        Assert.assertFalse(result);
    }

    @Test
    public void testPositive() {
        boolean result = SUT.isPositive(1);
        Assert.assertTrue(result);
    }
}