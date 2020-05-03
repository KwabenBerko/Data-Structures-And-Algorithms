package queue;

public interface Queue {

    void enqueue(int data);
    int dequeue();
    int front();
    boolean isEmpty();

}
