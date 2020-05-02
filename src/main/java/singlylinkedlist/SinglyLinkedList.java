package singlylinkedlist;

import java.util.Stack;

public class SinglyLinkedList {

    private SinglyLinkedListNode head;

    public void insert(int data){
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null){
            head = node;
            return;
        }

        SinglyLinkedListNode currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }


    public void reverse(){

        reverseWithRecursion(head);

        //Iterative
//        SinglyLinkedListNode currentNode = head;
//        SinglyLinkedListNode prevNode = null;
//
//        while(currentNode != null){
//
//            SinglyLinkedListNode nextNode = currentNode.next;
//            currentNode.next = prevNode;
//            prevNode = currentNode;
//            currentNode = nextNode;
//        }
//
//        head = prevNode;
    }

    public void reverseWithStack(){
        Stack<SinglyLinkedListNode> stack = new Stack<>();

        SinglyLinkedListNode currentNode = head;
        while(currentNode != null){
            stack.push(currentNode);
            currentNode = currentNode.next;
        }
        // 1 -> 2 -> 3 -> 4
        // 4 -> 3 -> 2 -> 1
        head = stack.pop();
        currentNode = head;
        while(!stack.isEmpty()){
            currentNode.next = stack.pop();
            currentNode = currentNode.next;
        }

        currentNode.next = null;
    }

    public void reverseWithRecursion(SinglyLinkedListNode currentNode){

        SinglyLinkedListNode nextNode = currentNode.next;

        if(nextNode == null){
            head = currentNode;
            return;
        }
        // 1 <- 2 <- 3
        reverseWithRecursion(nextNode);
        currentNode.next = null;
        nextNode.next = currentNode;

    }

    public int size(){
        int count = 0;

        SinglyLinkedListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.next;
            count++;
        }

        return count;
    }

    public void reversePrintWithRecursion(SinglyLinkedListNode head){
        //1 -> 2 -> 3 -> 4
        if(head == null){
            System.out.print("NULL");
            return;
        }

        reversePrintWithRecursion(head.next);
        System.out.print(" <- " + head.data);
    }

    public void reversePrint(){
        System.out.println();
        reversePrintWithRecursion(head);
    }

    public void printWithRecursion(SinglyLinkedListNode head){

        //1 -> 2 -> 3 -> 4

        if(head == null){
            System.out.print("NULL");
            return;
        }

        System.out.print(head.data + " -> ");
        printWithRecursion(head.next);
    }



    public void print(){

        System.out.println();
        printWithRecursion(head);


//        SinglyLinkedListNode currentNode = head;
//        while(currentNode != null){
//            SinglyLinkedListNode nextNode = currentNode.next;
//            System.out.print(currentNode.data + " -> ");
//            if(nextNode == null){
//                System.out.print("NULL");
//            }
//            currentNode = nextNode;
//        }
    }

}
