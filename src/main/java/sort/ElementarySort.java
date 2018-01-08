package sort;

/**
 * Created by rsingh13.
 */
public class ElementarySort {

    public void selectionSort(int [] input) {

        for(int i = 0 ; i < input.length; i++) {
                int minIndex = i ;

            for(int j = i+1 ; j < input.length;j++) {

                //find the current minIndex till this point and
                if(input[j] < input[minIndex]) {
                    minIndex = j;
                }
                
                swap(input,minIndex,j);

            }



        }

    }

    private void swap(int[] input, int i, int i1) {
        int temp = input[i];
        input[i] = input[i1];
        input[i1] = temp;
    }

}
