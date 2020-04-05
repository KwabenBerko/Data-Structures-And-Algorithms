package bubblesort;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] numbers = new int[]{15, 5, 24, 8, 1, 3, 16, 10, 20};
        recursiveBubbleSort(numbers, numbers.length - 1);
        //iterativeBubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void iterativeBubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void recursiveBubbleSort(int[] array, int endIndex){

        if(endIndex == 0){
            return;
        }

        for(int i = 0; i < endIndex; i++){
            if(array[i] > array[i + 1]){
                swap(array, i, i + 1);
            }
        }

        recursiveBubbleSort(array, endIndex - 1);
    }

}
