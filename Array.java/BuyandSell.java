public class BuyandSell {
    public static int totalProfit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice >= prices[i]){
                int profit = buyPrice - prices[i];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
