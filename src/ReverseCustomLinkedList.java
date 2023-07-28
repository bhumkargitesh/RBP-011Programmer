import java.util.LinkedList;

public class ReverseCustomLinkedList {

        private Node head;

        private static class Node {
            private int data;
            private Node next;

            Node(int data) {
                this.data = data;
                next = null;
            }
        }

        void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        void printBackward() {
            printBackwardRecursive(head);
        }

        private void printBackwardRecursive(Node node) {
            if (node == null) {
                return;
            }
            printBackwardRecursive(node.next);
            System.out.print(node.data + " ");
        }

        void reverse() {
            Node previousNode = null;
            Node nextNode;
            Node currentNode = head;

            while (currentNode != null) {
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
            }
            head = previousNode;
        }

        void printList() {
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }

        public static void main(String[] args) {
            ReverseCustomLinkedList linkedList = new ReverseCustomLinkedList();

            linkedList.insert(52);
            linkedList.insert(55);
            linkedList.insert(31);
            linkedList.insert(77);
            linkedList.insert(42);

            System.out.println("Original Linked List:");
            linkedList.printList();

            System.out.println("\n\nLinked List printed backward:");
            linkedList.printBackward();

            System.out.println("\n\nReversed Linked List:");
            linkedList.reverse();
            linkedList.printList();
        }
    }



