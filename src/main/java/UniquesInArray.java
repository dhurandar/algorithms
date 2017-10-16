/**
 * Created by rsingh13.
 */
public class UniquesInArray {


    static boolean isUnique(int[] input) {
        if(input.length == 0 || input.length == 1) {
            return true;
        }
        int xorChar=0;
        for(int i = 0 ; i < input.length; i++) {
            xorChar = xorChar^input[i];
        }

        System.out.println( xorChar );
        return false;
    }


    public static void main (String args[]){
        System.out.println( isUnique( new int[] {1,2,6,2,1}));
        System.out.println( isUnique( new int[] {4,3,6,2,1}));
    }
}
