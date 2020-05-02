package stack;

public class Runner {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(2);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);
        arrayStack.push(50);

        System.out.println(arrayStack.peek());

        while(!arrayStack.isEmpty()){
            System.out.print(arrayStack.pop() + " ");
        }

        System.out.println();

        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(60);
        linkedListStack.push(70);
        linkedListStack.push(80);
        linkedListStack.push(90);
        linkedListStack.push(100);

        System.out.println(linkedListStack.peek());

        while(!linkedListStack.isEmpty()){
            System.out.print(linkedListStack.pop() + " ");
        }

        System.out.println();

    }

}
