import java.util.LinkedList;

public class R_customLinkedList{
        public static void main(String[] args) {

            LinkedList<String> li = new LinkedList<String>();
            li.add("five");
            li.add("three");
            li.add("one");
            li.add("two");
            li.add("Five");
            System.out.print("Elements before reversing: " + li);
            li = reverseLinkedList(li);
            System.out.print("\nElements after reversing: " + li);
        }


        public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
            LinkedList<String> revLinkedList = new LinkedList<String>();
            for (int i = llist.size() - 1; i >= 0; i--) {


                revLinkedList.add(llist.get(i));
            }

            return revLinkedList;
        }
    }

