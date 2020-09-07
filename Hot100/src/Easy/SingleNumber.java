package Easy;

/**
 * @author Jialu Hu
 * @create 2020-09-07 18:50
 * 只出现一次的数字
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            /*
            异或运算⊕
            1. 任何数和 0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
            2. 任何数和其自身做异或运算，结果是 0，即 a⊕a=0。
            3. 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
             */
            single ^= num;
        }
        return single;
    }
}
