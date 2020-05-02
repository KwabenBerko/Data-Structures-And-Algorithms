package stack;

public class ArrayStack implements Stack{

    private int[] array;
    private int topIndex = -1;

    public ArrayStack(int initialLength){
        array = new int[initialLength];
    }

    public void push(int data){
        if(array.length == topIndex + 1){
            int[] temp = new int[array.length * 2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }

            array = temp;
        }

        array[++topIndex] = data;

    }


    public int pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return array[topIndex--];
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return array[topIndex];
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

}
