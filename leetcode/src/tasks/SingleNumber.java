package tasks;

import java.util.*;

/**
 * Created by Admin on 9/24/2015.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
           result = result ^ nums[i];
        }
        return result;
    }

    public int singleNumber1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i: nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        for (int i : set) {
            return i;
        }
        return 0;
    }
}
