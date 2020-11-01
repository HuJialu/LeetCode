package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 多数元素
 * @author Jialu Hu
 * @create 2020-11-01 20:47
 */
public class MajorityElement {
    //Method 1
    public int majorityElement1(int[] nums) {
        Map<Integer,Integer> counts = countNumbers(nums);

        Map.Entry<Integer,Integer> majorityEntry = null;
        for(Map.Entry<Integer,Integer> entry: counts.entrySet()){
            if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()){
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }
    private Map<Integer,Integer> countNumbers(int[] nums){
        Map<Integer,Integer> counts = new HashMap<>();
        for(int num:nums){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }
            else{
                counts.put(num,counts.get(num)+1);
            }
        }
        return counts;
    }

    //method 2
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    //method 3
    public int majorityElement3(int[] nums) {
        Random rand = new Random();

        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }
    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }
    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    //method 4
    public int majorityElement4(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }
    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    private int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }
}
