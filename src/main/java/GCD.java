/**
 * Created by rsingh13.
 * Recursive function calls for
 * gcd(a, b) = gcd(b, rem(a, b) ).
 *
 * gcd(259, 70) = gcd(70, 49) since rem.259; 70/ D 49
 *
 */
public class GCD {

    public int gcd (int a , int b ) {
        if(a == 0 ) return a;
        if(b == 0) return a;

        return gcd(b , a % b);
    }

    public static void main(String args[]){
        System.out.println(new GCD().gcd( 259,70 ));
        System.out.println(new GCD().gcd( 259,-70 ));
        System.out.println(new GCD().gcd( 0,-70 ));

        int i ;
        for(i = 0 ; i < 10 ; i++) {
        }
            int x = i;
        System.out.println(x);
        System.out.println( 4 & 3);

    }

    public static String f(int n ) {
        StringBuilder x = new StringBuilder(  );
        for(int i = 31 ; i >=0 ; i--) {
            int v = (1 << i) & n;

            x.append( v );
        }

        return x.toString();
    }

    public static int func(int n ) {
         if (n <= 0) return 0;
         return n + func ((int)n/2);

    }


}
