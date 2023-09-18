public class Solution13 {
/**
 * Calculates the maximum profit that can be made from buying and selling stocks.
 *
 * @param  prices  an array of stock prices
 * @return         the maximum profit that can be made
 */
public int maxProfit(int[] prices) {
    // Initialize variables to keep track of the maximum profit and the minimum price
    int profit = 0;
    int minPrice = Integer.MAX_VALUE; 

    // Iterate through the prices array
    for (int i = 0; i < prices.length; i++) {
        // If the current price is lower than the minimum price, update the minimum price
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } 
        // If the difference between the current price and the minimum price is greater than the current profit,
        // update the profit
        else if (prices[i] - minPrice > profit) {
            profit = prices[i] - minPrice;
        }
    }

    // Return the maximum profit
    return profit;
}
}

