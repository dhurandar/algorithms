import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rsingh13.
 */
public class ColinearPoints {

    static class Points {
        Integer x = 0;
        int y = 0;

        Points() {
            x = y = 0;
        }

        Points(int a , int b ) {
            x = a ;
            y = b;
        }

        /**
         * Compare 2 points via y coordiantes
         * @return
         */
        public boolean compareToY(Points points) {
            return false;
        }


        public double slope(Points input) {
            if(input == null) throw new IllegalArgumentException("argument cant be null");
            if((input.y-this.y == 0) && (input.x - this.x == 0)) return Double.NaN;
            if((input.y-this.y < 0) && (input.x - this.x == 0)) return Double.NEGATIVE_INFINITY;
            if((input.x - this.x == 0)) return Double.POSITIVE_INFINITY;

            //checks
            return (input.y-this.x)/(input.x-this.x);
        }

        public int hashCode() {
            return ((Integer.hashCode( this.x )+"=="+(Integer.hashCode( this.y ))).hashCode());
        }

    }
    public static void colinearPoints(List<Points> pointsList) {
        Map<Points, Integer> slopes = new HashMap<Points,Integer>(  );
        if(pointsList == null) throw new IllegalArgumentException(  );
        if(pointsList.size() == 0) return;

        Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer,Map<Integer,Integer>>();

        for(int i = 0 ;i <  pointsList.size() ;i++) {
            //n pow 2 ways of calculating the co-linearity
            for(int j = 0 ; j < pointsList.size();j++) {
                if (!slopes.containsKey( pointsList.get( i ).hashCode() )) {
                    slopes.put( pointsList.get( i ),pointsList.get( i ).hashCode() );
                }

            }

        }

    }
}


