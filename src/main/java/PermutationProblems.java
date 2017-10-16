/**
 * Created by rsingh13.
 */
public class PermutationProblems {


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
        System.out.println(checkPermutationPalindrome( "abcba" ));
        System.out.println(checkPermutationPalindrome( "abbcbcbcbcbcbcccbcbcbcbcbcbba" ));
        System.out.println(checkPermutationPalindrome( "rahul" ));
        System.out.println(checkPermutationPalindrome( "dalad" ));
        System.out.println(checkPermutationPalindrome( "malayalam" ));
        System.out.println(checkPermutationPalindrome( "#######malayalam#######" ));
    }
}
