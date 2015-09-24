package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import tasks.SingleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 9/24/2015.
 */
@RunWith(JUnit4.class)
public class SingleNumberTest extends Assert {
    private final Map<Integer, int[]> singleNumberData = new HashMap<Integer, int[]>();

    @Before
    public void setUpSingleNumber() {
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        singleNumberData.put(6, intArray);
        intArray = new int[] {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 6};
        singleNumberData.put(1, intArray);
        intArray = new int[] {1, 1, 2};
        singleNumberData.put(2, intArray);
    }

    @After
    public void tearDownSingleNumber() {
        //
    }

    @Test
    public void testSingleNumber() {
        for (Map.Entry<Integer, int[] > entry : singleNumberData.entrySet()) {
            final int[] testData = entry.getValue();
            final Integer expected = entry.getKey();
            final Integer actual = new SingleNumber().singleNumber(testData);
            assertEquals(expected, actual);
        }
    }
}