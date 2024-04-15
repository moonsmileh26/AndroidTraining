package mx.com.moonsmileh.androidtraining;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntervalsOverlapDetectorTest {

    IntervalsOverlapDetector SUT;

    @Before
    public void setup() {
        SUT = new IntervalsOverlapDetector();
    }

    // Interval1 is before interval2
    // Interval1 overlaps interval2 onStart
    // Interval1 overlaps interval2 onEnd
    // Interval1 contains interval2
    // Interval2 contains interval1
    // Interval1 is after interval2

}