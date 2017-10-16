/**
 * Created by rsingh13.
 */
public class MatrixOperations {

    public static boolean rotate (int[][] input) {

        if(input == null) {
            return false;
        }

        if(input.length != input[0].length) {
            return  false;
        }

        System.out.println("input ");
        printArray( input );

        for(int layer = 0 ; layer <= input.length/2 ; layer++) {
            swap(input,layer,input.length-1-layer);
        }

        return true;

    }

    private static void swap(int[][] matrix , int start , int end) {
        for(int i = start ; i < end ; i++) {
            int top= matrix[start][i];


            System.out.println(start + " , " + i+ " ==> " + (end-i) + ","+ start );
            matrix[start][i] = matrix[end-i][start];


            System.out.println((end-i) + ","+start + " ==>  " + (end)+","+(end-i) );
            matrix[end-i][start] = matrix[end][end-i];


            System.out.println((end)+","+(end-i)+ " ==> " +i+ ","+(end-i));
            matrix[end][end-i] = matrix[i][end];

            System.out.println(i+ ","+(end) + " ==> "+ start + "," +i
            );
            matrix[i][end] = top;


            printArray( matrix );

        }

    }


    static void printArray(int[][] array){

        for(int i = 0 ; i < array.length ; i++) {
            for(int j = 0 ; j < array.length;j++) {
                System.out.print(array[i][j] + " | ");
            }

            System.out.println();
        }

        System.out.println(" ============== ");

    }


    public static void main(String[] args) {

        int[][] input = createSquaerArray( 4 );
        rotate( input);
        System.out.println(" ====================================== ");

    }

    private static int[][] createSquaerArray(int size) {
        int[][] input = new int[size][size];
        for(int i = 0 ; i < size; i++) {
            for(int j = 0 ; j < size;j++) {
                if(i > 0)
                input[i][j] = input[i-1][size-1]+j+1;
                else
                input[i][j] = input[i][size-1]+j+1;

            }
        }
        return input;
    }
}
