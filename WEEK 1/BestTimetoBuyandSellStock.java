class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int min_value=prices[0];
        int max_value=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]<min_value){
                min_value=prices[i];

            }
            else{
                if (prices[i]-min_value>max_value){
                    max_value=prices[i]-min_value;
                }

            }

        }
        return max_value;
        
    }
} 
