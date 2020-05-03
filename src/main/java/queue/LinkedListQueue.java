package queue;

public class LinkedListQueue implements Queue {

    private static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public void enqueue(int data) {

        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    @Override
    public int dequeue() {

        if(isEmpty()){
            throw new IllegalStateException();
        }


        int data = head.data;

        head = head.next;
        if(head == null){
            tail = null;
        }

        return data;
    }

    @Override
    public int front() {

        if(isEmpty()){
            throw new IllegalStateException();
        }

        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }
}
