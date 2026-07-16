/*
 * Problem: Best Time to Buy and Sell Stock
 *
 * Description:
 * Given an array where each element represents the stock price
 * on a particular day, this program finds the maximum profit
 * that can be achieved by buying the stock on one day and
 * selling it on a later day.
 *
 * Example:
 * Input:  {7, 1, 5, 3, 6, 4}
 * Output: Maximum Profit = 5
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
