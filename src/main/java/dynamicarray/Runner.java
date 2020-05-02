package dynamicarray;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(2, 90);

        System.out.println("Index Of 40: " + array.indexOf(40));
        System.out.println("Size: " + array.size());
    }
}
