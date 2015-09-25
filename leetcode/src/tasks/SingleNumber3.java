package tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 9/24/2015.
 */
public class SingleNumber3 {

    public int[] singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int mask = findMask(xor);
        int num1 = 0;
        for (int i : nums) {
            if ((i & mask) > 0) {
                num1 ^= i;
            }
        }
        int[] result = new int[2];
        result[0] = num1;
        result[1] = num1 ^ xor;
        return result;
    }

    private int findMask(int num) {
        int index = 0;
        while (num > 1) {
            num >>= 1;
            index++;
        }
        for (int i = 0; i < index; i++) {
            num <<= 1;
        }
        return num;
    }

    public int[] singleNumber_old(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i: nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int i: set) {
            result[index] = i;
            index++;
        }
        return result;
    }
}
