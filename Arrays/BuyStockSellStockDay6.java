package ArrayProblems;

public class BuyStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

     // System.out.println(maxProfitBrute(prices));
        System.out.println(maxProfitOptimal(prices));

    }

    public static int maxProfitBrute(int[] prices) {

        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            for(int j = i + 1; j < prices.length; j++) {

                maxProfit = Math.max(
                        maxProfit,
                        prices[j] - prices[i]
                );
            }
        }

        return maxProfit;
    }

    private static int maxProfitOptimal(int[] prices){
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0;i<prices.length;i++){
            if(prices[i]>buyPrice){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
