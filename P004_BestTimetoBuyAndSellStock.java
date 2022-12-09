package problemsolving_leetcode;

public class P004_BestTimetoBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buy = 9999, sell = -1, maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    buy = prices[i];
                    sell = prices[j];
                    if (maxProfit < sell - buy) {
                        maxProfit = sell - buy;
                    }
                } else {
                    break;
                }
            }
        }
        return maxProfit;
    }
}
