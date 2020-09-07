package Easy;

/**
 * @author Jialu Hu
 * @create 2020-09-05 16:04
 * 最大子序和
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {
    //动态规划
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num:nums){
            if(sum > 0){
                sum += num;
            }
            else{
                sum = num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    //分治法
    public int maxSubArrayAdvanced(int[] nums){
        if(nums.length == 0)
            return 0;
        return get(nums,0,nums.length-1);
    }

    /**
     * 用于查询一个区间里的最大子序和
     * @param nums
     * @param l
     * @param r
     * @return
     */
    private int get(int[] nums,int l,int r){
        if(l>r) 
            return Integer.MIN_VALUE;
        int mid=(l+r)>>>1;
        int left=get(nums,l,mid-1);
        int right=get(nums,mid+1,r);
        int leftMax=0,rightMax=0;
        int sum=0;
        for(int i=mid-1;i>=l;i--){
            sum+=nums[i];
            leftMax=Math.max(leftMax,sum);
        }
        sum=0;
        for(int j=mid+1;j<=r;j++){
            sum+=nums[j];
            rightMax=Math.max(rightMax,sum);
        }
        return Math.max(leftMax+nums[mid]+rightMax,Math.max(left,right));
    }
}





















