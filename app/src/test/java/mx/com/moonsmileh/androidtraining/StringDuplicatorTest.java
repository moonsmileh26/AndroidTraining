package mx.com.moonsmileh.androidtraining;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup() {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        String result = SUT.duplicate("");
        Assert.assertEquals(result, "");
    }

    @Test
    public void duplicate_anyString_stringDuplicatedReturned() {
        String result = SUT.duplicate("Any");
        Assert.assertEquals(result, "AnyAny");
    }

}