/**
 * @author Jialu Hu
 * @create 2020-10-11 20:08
 * 删除排序数组中的重复项
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int len = 0;
        int i=0;
        while(i<nums.length){
            int j;
            for ( j = i+1  ; j < nums.length ;j++) {
                if(nums[i] != nums[j]){
                    len++;
                    nums[len] = nums[j];
                    break;
                }
            }
            i = j;
        }
        return len+1;
    }
}
