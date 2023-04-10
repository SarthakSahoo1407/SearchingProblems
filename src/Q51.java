public class Q51 {
    public static int maxProfit(int stocks[], int size) {
        int buy = 0, sell = 0;
        int curMin = 0;
        int currProfit = 0;
        int maxProfit = 0;
        int i;
        for (i = 0; i < size; i++) {
            if (stocks[i] < stocks[curMin]) {
                curMin = i;
            }
            currProfit = stocks[i] - stocks[curMin];
            if (currProfit > maxProfit) {
                buy = curMin;
                sell = i;
                maxProfit = currProfit;
            }
        }
        System.out.println("Purchase day is- " + buy + " at price " + stocks[buy]);
        System.out.println("Sell day is- " + sell + " at price " + stocks[sell]);
        return maxProfit;
    }
    public static void main(String[] args) {
        int stocks[] = { 100, 180, 260, 310, 40, 535, 695 };
        int size = stocks.length;
        System.out.println("Maximum profit is- " + maxProfit(stocks, size));
    }
}
