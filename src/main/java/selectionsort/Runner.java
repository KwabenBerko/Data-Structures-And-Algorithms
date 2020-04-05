package selectionsort;

import java.util.Arrays;

public class Runner {
    public static void main (String[] args){
        int[] numbers = new int[]{15, 5, 24, 8, 1, 3, 16, 10, 20};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] array){

        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
