package dynamicarray;

import java.util.Arrays;

public class DynamicArray<T> {

    private T[] array;
    private int length = 0;
    private int size = 0;

    public DynamicArray(int length){
        this.length = length;
        array = (T[]) new Object[length];
    }

    public void add(T data){

        if(array.length == size){
            T[] newArray = (T[]) new Object[length * 2];
            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }

            array = null;
            array = newArray;
        }


        array[size++] = data;
    }

    public void add(int index, T data){
        if(index > size - 1){
            throw new IllegalArgumentException();
        }

        array[index] = data;
    }

    public T get(int index){
        if(index > size - 1){
            throw new IllegalArgumentException();
        }

        return array[index];

    }

    public int indexOf(T data){
        int index = -1;

        for(int i = 0; i < size; i++){
            if(array[i] == data){
                index = i;
                break;
            }
        }

        return index;
    }

    public void remove(int index){
        //2 3 4 5 NULL


        if(index > size - 1){
            throw new IllegalArgumentException();
        }

        for(int i = index + 1; i < size; i++){
            array[i - 1] = array[i];
        }

        array[--size] = null;

        System.out.println(Arrays.toString(array));
    }

    public int size(){
        return size;
    }

}
