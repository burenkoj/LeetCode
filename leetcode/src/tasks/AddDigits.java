package tasks;

import java.util.ArrayList;

/**
 * Created by Admin on 9/23/2015.
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
            if (sum > 9) {
                sum = sum % 10 + sum / 10;
            }
        }
        if (sum > 9) {
            sum = sum % 10 + sum / 10;
        }
        return sum;
    }

    public int addDigits2(int num) {
        if (num < 10) return num;
        ArrayList<Integer> result = getArray2(num);
        while  (result.size() > 1) {
            int number = 0;
            for (Integer i : result) {
                number += i;
            }
            result = getArray2(number);
        }
        return result.get(0);
    }

    private ArrayList<Integer> getArray2(int num) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (num > 0) {
            result.add(num % 10);
            num = num / 10;
        }
        return result;
    }

}