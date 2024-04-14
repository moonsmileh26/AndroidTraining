package mx.com.moonsmileh.androidtraining;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void testNegativeNumber() {
        boolean result = SUT.isNegative(-1);
        Assert.assertTrue(result);
    }

    @Test
    public void testZero() {
        boolean result = SUT.isNegative(0);
        Assert.assertTrue(result);
    }

    @Test
    public void testPositiveNumber() {
        boolean result = SUT.isNegative(1);
        Assert.assertFalse(result);
    }

}