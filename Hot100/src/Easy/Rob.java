package Easy;

/**
 * 打家劫舍
 * @author Jialu Hu
 * @create 2020-11-01 21:05
 */
public class Rob {
    public int rob(int[] nums) {
        //动态规划
        if(nums == null || nums.length ==0){
            return 0;
        }
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[length-1];
    }
}
