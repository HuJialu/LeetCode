package Easy;

/**
 * @author Jialu Hu
 * @create 2020-09-07 18:08
 * 爬楼梯
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int l=0,m=0,r=1;
        for (int i = 1; i <= n; i++) {
            l = m;
            m = r;
            r = l + m;
        }
        return r;
    }


}
