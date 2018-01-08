import java.util.Arrays;

/**
 * Created by rsingh13.
 */
public class PermutationProblems {


    static void permutations(char[] input, int start) {

        if(input == null) return;


        if(start == input.length) {
            System.out.print( Arrays.toString( input ) );
            return;
        }


        for(int i = start ; i < input.length;i++) {
            swap( input, i, start );
            permutations( input,start+1 );
            swap( input,start,i );
        }

    }

    private static void swap(char[] input, int i, int start) {
        char temp = input[i];
        input[i] = input[start];
        input[start] = temp;
    }


    static boolean checkPermutationPalindrome(String str) {
        if(str == null) return false;
        if(str.length() == 1 || str.length() ==0 ) return true;

        int checker = 0;
        for(int i=0;i<str.length();i++) {
            checker ^= 1 << str.charAt( i );
        }

        System.out.println(checker);

        return ((checker & (checker -1 )) == 0);
    }


    public static void main(String[] str) {

        permutations( "abc".toCharArray(),0 );
//        System.out.println(checkPermutationPalindrome( "abcba" ));
//        System.out.println(checkPermutationPalindrome( "abbcbcbcbcbcbcccbcbcbcbcbcbba" ));
//        System.out.println(checkPermutationPalindrome( "rahul" ));
//        System.out.println(checkPermutationPalindrome( "dalad" ));
//        System.out.println(checkPermutationPalindrome( "malayalam" ));
//        System.out.println(checkPermutationPalindrome( "#######malayalam#######" ));
    }
}
