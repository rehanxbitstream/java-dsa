public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int price:prices){
            if(i<minPrice){
                minPrice = price;
            }
            if(price-minPrice>maxPrice){
                maxPrice = price-minPrice;
            }

        }

         return maxPrice;
            
        }
       
        
    
}
