package mergesort;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = new int[]{15, 5, 24, 8, 1, 3, 16, 10, 20};
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }


    private static void mergeSort(int[] array, int startIndex, int endIndex){

    }
}
