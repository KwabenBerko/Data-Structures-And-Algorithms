package medianoftwoarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Runner{
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5};
        int[] arr2 = new int[]{2, 4, 6};

        //For Median, Item must be Ordered;
        int median = medianOfTwoArrays(arr1, arr2);
        System.out.println(median);
    }

    private static int medianOfTwoArrays(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        //1, 3, 5
        //2, 4, 6

        //LP = 5;
        //RP = 6

        // 1 2 3 4, 5 6
        // 6 + 1 / 2 = 3.5;

        //pOne = 1
        //pTwo = 1
        //1 2

        int arr1Pointer = 0;
        int arr2Pointer = 0;

        while(arr1Pointer < arr1.length){
            if(arr1[arr1Pointer] < arr2[arr2Pointer]){
                arr1Pointer++;
                arr[arr1Pointer] = arr1[arr1Pointer];
            }
            else{
                arr2Pointer++;
                arr[arr1Pointer] = arr2[arr2Pointer];

            }
        }

        //arr[arr1Pointer] = arr2[arr2Pointer];


        System.out.println(Arrays.toString(arr));

        return 1;
    }


}
