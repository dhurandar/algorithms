/**
 * A password is considered strong if below conditions are all met:
 * <p>
 * It has at least 6 characters and at most 20 characters.
 * It must contain at least one lowercase letter, at least one uppercase letter, and at least one digit.
 * It must NOT contain three repeating characters in a row ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
 * Write a function strongPasswordChecker(s), that takes a string s as input, and return the MINIMUM change required to make s a strong password. If s is already strong, return 0.
 * <p>
 * Insertion, deletion or replace of any one character are all considered as one change.
 */
public class StrongPasswordChecker {
    public int strongPasswordChecker(String s) {
        return calStats(s);
    }

    private int calStats(CharSequence s) {
        int size = s.length();

        boolean lCase = false;
        boolean uCase = false;
        boolean digit = false;
        int repScore = 0;
        int result = 0;
        int remainingReps = 0;

        for (int i = 0; i <
                size; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                lCase = true;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                uCase = true;
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                digit = true;

            int repetition = checkForRepetition(s, i);

            if(repetition > 0) {
                i += repetition - 1;
                repScore += repetition / 3;
            }
            if(repetition > 3)
                remainingReps += repetition % 3;
        }

        int editScore = 0;
        if (!lCase) editScore++;
        if (!uCase) editScore++;
        if (!digit) editScore++;

        result = (repScore >= editScore) ? repScore : editScore;

        if(size < 6) {
           if((6-size) > result)
               result = 6 - size;
        }

        System.out.println("editscore  " + editScore);
        System.out.println("repScore " + repScore + " remainingreps " + remainingReps);


        System.out.println("correctinnesst  & size " + result + " " + size);

        //Special Case of Repetition and size overlap
        if(size > 20 ) {

            if((editScore >= repScore )){
                result += (size - 20 )  ;
            } else if (remainingReps > 0 && repScore < (size - 20) ){
                result = (size - 20) + remainingReps - repScore  ;
            } else if(repScore < (size - 20)){
                result = size - 20;
            }

        }


        return result;
    }

    private int checkForRepetition(CharSequence s, int i) {
        char c = s.charAt(i);
        int count = 0;
        while ( i <= s.length()-1 && s.charAt(i) == c ) {
            count = count + 1;
            i += 1;
        }
        return count;
    }


    public static void main(String args[]) {
        StrongPasswordChecker checker = new StrongPasswordChecker();
        System.out.println(checker.strongPasswordChecker("") + "  6");
//        System.out.println(checker.strongPasswordChecker("art193jsab"));
//        System.out.println(checker.strongPasswordChecker("aaat193jsab"));
//        System.out.println(checker.strongPasswordChecker("aaa123"));
        System.out.println(checker.strongPasswordChecker("aaa111") + " 2");
        System.out.println(checker.strongPasswordChecker("aA123") + " 1");
        System.out.println(checker.strongPasswordChecker("ABABABABABABABABABAB1") + " == 2");
        System.out.println(checker.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaa") + " 7");
        System.out.println(checker.strongPasswordChecker("1010101010aaaB10101010") + " ++ 2");
        System.out.println(checker.strongPasswordChecker("abababababababababaaa") + " 3");
        System.out.println(checker.strongPasswordChecker("1234567890123456Baaaaa") + " ==3");
        System.out.println(checker.strongPasswordChecker("pppppp1020304050607080") + " 3");

    }

}

