package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import tasks.IsHappy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 9/23/2015.
 */
@RunWith(JUnit4.class)
public class IsHappyTest  extends Assert {
    private final Map<Integer, Boolean> isHappyData = new HashMap<Integer, Boolean>();
//
    @Before
    public void setUpIsHappy() {
        isHappyData.put(19, true);
        isHappyData.put(1, true);
        isHappyData.put(3, false);
        isHappyData.put(9, false);
    }

    @After
    public void tearDownIsHappy() {
    }

    @Test
    public void testIsHappy() {
        for (Map.Entry<Integer, Boolean> entry : isHappyData.entrySet()) {
            final Integer testData = entry.getKey();
            final Boolean expected = entry.getValue();
            final Boolean actual = new IsHappy().isHappy(testData);
            assertEquals(expected, actual);
        }
    }
}