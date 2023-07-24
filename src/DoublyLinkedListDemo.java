public class DoublyLinkedListDemo {

    Node head;
    Node tail;
    //Create a node for doubly linked list
    class Node{
        String data;
        Node prev;
        Node next;

        public Node(String data) {
            this.data = data;
            this.prev=null;
            this.next=null;
        }
    }

    public void addNewNode(String data) {

        //Create node
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {

            //The newly created node will be the last node, so now tail's next will point to that newly created node
            tail.next = newNode;
            //The tail is pointing to the second last node so the newly created node's prev will point to tail
            newNode.prev = tail;
            //The newly created node will become new tail because it is last node in the doubly linked list
            tail = newNode;
            tail.next = null;
        }
    }

    //Create PrintData() method
    public void printData() {
        Node curr = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        //Iterate the doubly linked list using while
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    // main method ...

    public static void main(String[] args) {

        DoublyLinkedListDemo demo = new DoublyLinkedListDemo();

        //Add nodes into the doubly linked list
        demo.addNewNode("India");
        demo.addNewNode("East Indian");
        demo.addNewNode("West Indian");
        demo.addNewNode("South Indian");
        demo.addNewNode("North Indian");

        demo.printData();
        demo.addNewNode("i am indian");
        demo.printData();
    }
}


