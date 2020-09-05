package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jialu Hu
 * @create 2020-09-05 15:26
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    /*
    一遍哈希表
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp))
                return new int[]{map.get(temp),i};
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
