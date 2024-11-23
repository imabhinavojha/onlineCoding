package GFG;

public class maximumProfit {
    public static void main(String[] args) {
        maximumProfit obj = new maximumProfit();
        int arr [] = {100, 180, 260, 310, 40, 535, 695};
        // int maaxValue = obj.maximumProfit(arr);
        // System.out.println(maaxValue);

        int arr1[] = {7, 10, 1, 3, 6, 9, 2};
        int maaxValue1 = obj.maximumProfit1(arr1);
        System.out.println(maaxValue1);
    }

    public int maximumProfit(int prices[]) {
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxProfit+=prices[i+1]-prices[i];
                System.out.println("value "+maxProfit);
            }
        }
        return maxProfit;
    }

    public int maximumProfit1(int prices[]) {
        int maxProfit=0;
        int bestBuy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] > bestBuy){
                
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }
    
}
