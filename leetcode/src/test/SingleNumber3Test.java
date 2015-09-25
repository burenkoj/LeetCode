package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tasks.SingleNumber3;

import java.util.*;

/**
 * Created by Admin on 9/24/2015.
 */
public class SingleNumber3Test extends Assert {
    private final Map<int[], int[]> singleNumber3Data = new HashMap<int[], int[]>();

    @Before
    public void setUpSingleNumber3() {
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 12};
        int[] intResultArray = new int[] {6, 12};
        singleNumber3Data.put(intResultArray, intArray);
        intArray = new int[] {1, 2, 3, 4, 5, 9, 6, 5, 4, 3, 2, 6};
        intResultArray = new int[] {1, 9};
        singleNumber3Data.put(intResultArray, intArray);
        intArray = new int[] {1, 1, 2, 4};
        intResultArray = new int[] {2, 4};
        singleNumber3Data.put(intResultArray, intArray);
    }

    @After
    public void tearDownSingleNumber3() {
    }

    @Test
    public void testSingleNumber3() {
        for (Map.Entry<int[], int[] > entry : singleNumber3Data.entrySet()) {
            final int[] testData = entry.getValue();
            final int[] expected = entry.getKey();
            final int[] actual = new SingleNumber3().singleNumber(testData);
            List<Integer> test = getArray(expected);
            test.removeAll(getArray(actual));
            assertEquals(test.size(), 0);
        }
    }

    private List<Integer> getArray(int[] array) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i : array) {
            result.add(i);
        }
        return result;
    }
}
