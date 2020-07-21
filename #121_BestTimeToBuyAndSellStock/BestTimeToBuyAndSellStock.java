public class BestTimeToBuyAndSellStock {

    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     *
     * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     *
     * Note that you cannot sell a stock before you buy one.
     */


    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy_price = prices[0];
        int result = 0;

        for (int price : prices) {

            if (price < buy_price) {
                buy_price = price;
            } else if (price - buy_price > result) {
                result = price - buy_price;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        BestTimeToBuyAndSellStock action = new BestTimeToBuyAndSellStock();

        int[] test1 = {7,1,5,3,6,4};
        int result1 = 5;
        System.out.println(action.maxProfit(test1) == (result1));

        int[] test2 = {7,6,4,3,1};
        int result2 = 0;
        System.out.println(action.maxProfit(test2) == (result2));

        int[] test3 = {2,4,1};
        int result3 = 2;
        System.out.println(action.maxProfit(test3) == (result3));
    }
}
