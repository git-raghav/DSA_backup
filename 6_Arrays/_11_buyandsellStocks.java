import java.util.*;

public class _11_buyandsellStocks {
    public static void find(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 0) {
                if (buyPrice < prices[i]) {// profit
                    int profit = prices[i] - buyPrice;// todays profit
                    maxProfit = Math.max(maxProfit, profit);
                } else {
                    buyPrice = prices[i];
                }
            }
        }
        System.out.println("maximum profit = " + maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 4,3,2,1 };
        find(prices);
    }
}