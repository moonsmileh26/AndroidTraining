package mx.com.moonsmileh.androidtraining;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverserTest {
    StringReverser SUT;

    @Before
    public void setUp() {
        SUT = new StringReverser();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned() {
        String result = SUT.reverse("");
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void reverse_singleCharacter_sameStringReturned() {
        String result = SUT.reverse("a");
        Assert.assertEquals(result, "a");
    }

    @Test
    public void reverse_longString_reversedStringReturned() {
        String result = SUT.reverse("mom");
        Assert.assertEquals(result, "mom");

    }
}