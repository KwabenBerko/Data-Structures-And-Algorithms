package stack;

import java.util.ArrayDeque;

public class LinkedListStack implements Stack {

    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void push(int data) {
        Node node = new Node(data);

        node.next = head;

        head = node;


    }

    @Override
    public int pop() {

        if(head == null){
            throw new IndexOutOfBoundsException();
        }

        int data = head.data;

        head = head.next;

        return data;
    }

    @Override
    public int peek() {

        if(head == null){
            throw new IndexOutOfBoundsException();
        }

        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


}
