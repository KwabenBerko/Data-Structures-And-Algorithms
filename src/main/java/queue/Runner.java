package queue;

public class Runner {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);

        System.out.println(arrayQueue.front());

        while(!arrayQueue.isEmpty()){
            System.out.print(arrayQueue.dequeue() + " ");
        }

        System.out.println();
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(60);
        linkedListQueue.enqueue(70);
        linkedListQueue.enqueue(80);
        linkedListQueue.enqueue(90);
        linkedListQueue.enqueue(100);

        System.out.println(linkedListQueue.front());

        while(!linkedListQueue.isEmpty()){
            System.out.print(linkedListQueue.dequeue() + " ");
        }
    }

}
