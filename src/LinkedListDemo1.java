public class LinkedListDemo1 {
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){       //constructor
            //assign data
            this.data=data;
            this.next=null;
        }
    }
    // add first node/data.
    //write function and  parameter
    public void addFirst(String  data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }
// last node add
    public void addLast(String  data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode =currentNode.next;
        }
        currentNode.next = newNode;
    }
    //print...
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");

    }
    public static void main(String[] args) {
        LinkedListDemo1  list = new LinkedListDemo1();
        list.addFirst("is");
        list.addFirst("name");
        list.printList();
        list.addFirst("My");
        list.printList();

        list.addLast("Gitesh");
        list.printList();
    }
}
