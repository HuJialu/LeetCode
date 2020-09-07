package Easy;

/**
 * @author Jialu Hu
 * @create 2020-09-07 18:44
 * 买卖股票的最佳时机
 */
public class MaxProfit {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i]-minPrice>maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
}
