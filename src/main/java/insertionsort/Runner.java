package insertionsort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = new int[]{15, 5, 24, 8, 1, 3, 16, 10, 20};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertionSort(int[] array){
        //current = 2
        //5, 5, 9, 8
        for(int i = 0; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }
}
