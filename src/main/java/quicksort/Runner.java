package quicksort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = new int[] {15, 5, 24, 8, 1, 3, 16, 10, 20};
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int partition(int[] array, int startIndex, int endIndex){

        int pivot = endIndex;
        int leftPointer = startIndex;
        int rightPointer = endIndex - 1;

        while(leftPointer < rightPointer){
            while(array[leftPointer] < array[pivot]){
                leftPointer++;
            }
            while(array[rightPointer] >= array[pivot]){
                rightPointer--;
            }

            if(leftPointer < rightPointer){
                swap(array, leftPointer, rightPointer);
            }
        }

        swap(array, leftPointer, pivot);

        return leftPointer;
    }

    private static void quickSort(int[] array, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }

        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);
    }
}
