package Y2021.M11.Mengyu.temp.Questions;

import java.util.HashSet;
import java.util.Set;

public class LC136SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        for (int i : set) {
            return i;
        }
        return -1;
    }
    public int singleNumXOR (int[] nums) {
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }

}
