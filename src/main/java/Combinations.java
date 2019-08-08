
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rsingh13.
 */
public class Combinations {

    public static int combinations(int n, int k) {
        return  combinations( n,k,new int[n+1][k+1] );
    }

    public static int combinations(int n , int k,int[][] nck) {

        if(k == 0 || n == k )
            return 1;

        if(nck[n][k] == 0) {
            int withoutK = combinations( n-1,k,nck );
            int withK = combinations( n-1,k-1,nck );
            nck[n][k] = withK + withoutK;

        }

        return nck[n][k];

    }



    public static void combinations(List<StringBuilder> input, int k,int startIndex,
                                                   List<StringBuilder> partialCombination ,
                                                   List<List<StringBuilder>> result) {


        if (partialCombination.size() == k) {
            System.out.println("adding to the result " + partialCombination);
            result.add( new ArrayList<StringBuilder>(partialCombination) );
            return;
        }


        final int numRemaining = k - partialCombination.size();
        for (int i = startIndex; i < input.size() && numRemaining <= input.size() - i + 1; ++i) {
            partialCombination.add( input.get( i ) );
            combinations( input, k, i + 1, partialCombination, result );
            partialCombination.remove( partialCombination.size() - 1 );
            if(partialCombination.isEmpty() ) {
                System.out.println(" partial array is empty " + partialCombination.isEmpty());
            }
        }
    }

    private static void prependPrefix(StringBuilder prefix, List<StringBuilder> withoutK) {
        for(StringBuilder element: withoutK) {
            element.append( " " + prefix+ " " )  ;
        }
    }



    public static void main(String args[]) {

        //System.out.println(combinations( 3,1));

        ArrayList<StringBuilder> input = new ArrayList<StringBuilder>(  );
            input.add(new StringBuilder( " A " ));
            input.add(new StringBuilder( " B " ));
            input.add(new StringBuilder( " C " ));
            input.add(new StringBuilder( " D " ));
//            input.add(new StringBuilder( "3ahul" ));

            List<List<StringBuilder>> rs = new ArrayList<List<StringBuilder>> ();
            combinations( input ,2,0,new ArrayList<StringBuilder>(  ),rs);

            for(List<StringBuilder> list : rs) {
                System.out.println(list);
            }

        }

    }
