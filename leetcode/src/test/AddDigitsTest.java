package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import tasks.AddDigits;
import java.util.Map;

/**
 * Created by Admin on 9/23/2015.
 */
@RunWith(JUnit4.class)
public class AddDigitsTest extends Assert {
    private final Map<Integer, Integer> addDigitsData = new HashMap<Integer, Integer>();

    @Before
    public void setUpAddDigits() {
        addDigitsData.put(123, 6);
        addDigitsData.put(0, 0);
        addDigitsData.put(100000008, 9);
        addDigitsData.put(123456789, 9);
        addDigitsData.put(980456, 5);
        addDigitsData.put(989456, 5);
        addDigitsData.put(9877895, 8);
    }

    @After
    public void tearDownAddDigits() {
        //
    }

    @Test
    public void testAddDigits() {
        for (Map.Entry<Integer, Integer> entry : addDigitsData.entrySet()) {
            final Integer testData = entry.getKey();
            final Integer expected = entry.getValue();
            final Integer actual = new AddDigits().addDigits(testData);
            assertEquals(expected, actual);
        }
    }
}