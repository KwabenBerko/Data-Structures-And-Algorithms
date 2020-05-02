package singlylinkedlist;

public class Runner {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(5);

        list.print();
        list.reverseWithStack();
        list.print();
    }
}
