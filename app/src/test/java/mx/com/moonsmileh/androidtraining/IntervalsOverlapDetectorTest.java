package mx.com.moonsmileh.androidtraining;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntervalsOverlapDetectorTest {

    IntervalsOverlapDetector SUT;

    @Before
    public void setup() {
        SUT = new IntervalsOverlapDetector();
    }

    // Interval1 is before interval2
    @Test
    public void isOverlap_interval1BeforeInterval2_falseReturned() {
        Interval interval1 = new Interval(-3, 1);
        Interval interval2 = new Interval(3, 5);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertFalse(result);
    }

    // Interval1 overlaps interval2 onStart
    @Test
    public void isOverlap_interval1OverlapsInterval2OnStart_trueReturned() {
        Interval interval1 = new Interval(-3, 2);
        Interval interval2 = new Interval(1, 5);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertTrue(result);
    }

    // Interval1 overlaps interval2 onEnd
    @Test
    public void isOverlap_interval1OverlapsInterval2OnEnd_trueReturned() {
        Interval interval1 = new Interval(-3, 6);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertTrue(result);
    }

    // Interval1 contains interval2
    @Test
    public void isOverlap_interval1ContainsInterval2_trueReturned() {
        Interval interval1 = new Interval(-6, 6);
        Interval interval2 = new Interval(-3, 3);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertTrue(result);
    }

    @Test
    public void isOverlap_interval2ContainsInterval1_trueReturned() {
        Interval interval1 = new Interval(-3, 3);
        Interval interval2 = new Interval(-6, 6);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertTrue(result);
    }

    // Interval1 is after interval2
    @Test
    public void isOverlap_interval1AfterInterval2_falseReturned() {
        Interval interval1 = new Interval(-3, 1);
        Interval interval2 = new Interval(2, 5);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertFalse(result);
    }

    @Test
    public void isOverlap_interval1BeforeAdjacentInterval2_falseReturned() {
        Interval interval1 = new Interval(-3, 3);
        Interval interval2 = new Interval(3, 6);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertFalse(result);
    }

    @Test
    public void isOverlap_interval1AfterAdjacentInterval2_falseReturned() {
        Interval interval1 = new Interval(1, 5);
        Interval interval2 = new Interval(-5, 1);
        boolean result = SUT.isOverlap(interval1, interval2);
        Assert.assertFalse(result);
    }

}