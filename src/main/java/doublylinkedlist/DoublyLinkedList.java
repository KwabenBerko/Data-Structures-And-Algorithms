package doublylinkedlist;

public class DoublyLinkedList {

    private DoublyLinkedListNode head;

    public void insertAtHead(int data){
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if(head == null){
            head = node;
            return;
        }

        head.prev = node;
        node.next = head;
        head = node;
    }


    public void insertAtTail(int data){
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        DoublyLinkedListNode currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = node;
        node.prev = currentNode;
    }

    // 1 -- 5 -- 20 -- 6 -- 10 -> NULL
    // 1 -- 5

    public void reverse(){
        DoublyLinkedListNode currentNode = head;
        while(currentNode != null){
            DoublyLinkedListNode prevNode = currentNode.prev;
            DoublyLinkedListNode nextNode = currentNode.next;

            currentNode.prev = nextNode;
            currentNode.next = prevNode;

            if(nextNode == null){
                head = currentNode;
            }

            currentNode = nextNode;
        }
    }

    public void sortedInsert(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null) {
            DoublyLinkedListNode nextNode = currentNode.next;
            DoublyLinkedListNode prevNode = currentNode.prev;

            if (data <= currentNode.data) {
                currentNode.prev = node;
                node.next = currentNode;
                if (prevNode == null) {
                    head = node;
                }
                else{
                    prevNode.next = node;
                    node.prev = prevNode;
                }

                break;

            } else if (currentNode.next == null) {
                currentNode.next = node;
                node.next = currentNode;
                break;
            }


            currentNode = nextNode;
        }
    }

    public void print(){
        DoublyLinkedListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -- ");
            currentNode = currentNode.next;
        }
    }
}
