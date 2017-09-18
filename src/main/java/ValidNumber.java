/**
 * Created by rsingh13.
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true
 Note: It is intended for the problem statement to be ambiguous.
 You should gather all requirements up front before implementing one.

 We need to decide on whats the maximum radix
 */
public class ValidNumber {


    public ValidNumber(String number , int radix ) {
        System.out.println(isValidNumber(  number,radix));
    }
    public int isValidNumber(String number , int radix ) {

        if(number == null || number.isEmpty()) {
            throw new IllegalArgumentException( "number cant be null" );
        }

        if (radix < 2) {
            throw new IllegalArgumentException( "" );
        }

        if(radix > 36) {
            throw new IllegalArgumentException( " radix above 36 not supported " );
        }

        int i = 0,len  = number.length();
        int limit = -Integer.MAX_VALUE;
        int digit;


        int result = 0;
        boolean negative = false;
        int multmin;

        if(len > 0) {
            char firstChar = number.charAt( 0 );

            if(firstChar < '0') {
                if(firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if(firstChar != '+') {
                    throw new NumberFormatException("improper number");
                }
            }
            while (i < len) {
                digit = Character.digit(number.charAt(i++),radix);
                System.out.println(digit);

                if (digit < 0) {
                    throw new NumberFormatException("");
                }
                result = result * radix;
                if (result < limit + digit) {
                    throw new NumberFormatException("cant make the number");
                }
                result -= digit;
            }
        }

        return negative ? result : -result;
    }


    public static void main(String args[]) {

       //new ValidNumber( "ffff",16 );
        new ValidNumber( "124.94948484",10 );
    }



}
