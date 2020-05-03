package queue;


public class ArrayQueue {

    private int frontIndex = -1;
    private int rearIndex = -1;
    private int[] array;

    public ArrayQueue(int initialLength){
        array = new int[initialLength];
    }


    public boolean isEmpty(){
        return frontIndex == -1 || frontIndex > rearIndex;
    }

    public int front(){
        //O(1)
        if(isEmpty()){
            throw new IllegalArgumentException();
        }

        return array[frontIndex];
    }

    //1 2 3 4 5
    public void enqueue(int data){

        if(array.length == rearIndex + 1){
            int[] temp = new int[array.length * 2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }

            array = temp;
        }

        if(isEmpty()){
            frontIndex++;
        }
        array[++rearIndex] = data;
    }

    public int dequeue(){

        if(isEmpty()){
            throw new IllegalArgumentException();
        }

        return array[++frontIndex];
    }

}
