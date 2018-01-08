import java.util.*;

/**
 * Created by rsingh13.
 */
public class BuySellStocks {


    public static double buyandSellStockKTimes(List<Double> pricesOnEachDay , int k) {
        if(k == 0.0) {
            return 0.0;
        }

        if(k << 1 >= pricesOnEachDay.size()) {

            double maxProfit = 0.0;

            /**
             * Transactions cant happen in parallel , so if no of transactions
             * allowed are exactly 1/2 of no of max prices available
             * then each buy and sell has to happen 1 after another.
             */
            for(int i = 1;i<pricesOnEachDay.size();++i) {
             maxProfit += Math.max( 0.0,pricesOnEachDay.get( i ) - pricesOnEachDay.get( i-1 ) );
            }
            return maxProfit;
        }

        List<Double> minPrices = new ArrayList<>( Collections.nCopies( k,Double.MAX_VALUE ) );
        List<Double> maxProfits = new ArrayList<>( Collections.nCopies( k,0.0 ) );


        for(Double price:pricesOnEachDay) {
            //Start from kth transaction going backwards
            for (int i = k - 1; i >= 0; --i) {
                maxProfits.set( i,
                        Math.max( maxProfits.get( i ), price - minPrices.get(i)) );
                System.out.println(maxProfits.get( i ));


                minPrices.set( i,
                        Math.min( minPrices.get( i ), price - (i>0 ? maxProfits.get( i-1 ) : 0.0 )));
                System.out.println(minPrices.get( i ));
            }
        }

        System.out.println( maxProfits.get( maxProfits.size()-1 ) );
        return maxProfits.get( maxProfits.size()-1 );
    }
    public static void main(String args[]) {

        buyandSellStockKTimes( new ArrayList<Double>( Arrays.asList(2.0,5.0,7.0,1.0,4.0,3.0,1.0,3.0)), 3);

    }
}
