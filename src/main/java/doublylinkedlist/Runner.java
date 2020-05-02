package doublylinkedlist;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtHead(2);
        list.insertAtTail(3);
        list.insertAtTail(4);

        list.print();

        list.sortedInsert(1);

        System.out.println();
        list.print();
    }
}
