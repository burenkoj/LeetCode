package tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 9/23/2015.
 */
public class IsHappy {
//
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int sqr = getSqr(n);
        do {
            set.add(sqr);
            sqr = getSqr(sqr);
        } while(!set.contains(sqr));
        return sqr == 1;
    }

    private int getSqr(int n) {
        int sqr = 0;
        while (n > 0) {
            sqr += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sqr;
    }
}
