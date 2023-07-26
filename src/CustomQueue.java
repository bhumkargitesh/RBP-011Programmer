//Queue and Dequeue Concept.
    public class CustomQueue {
        int arr[];
        int front;
        int rear;
        int capacity;

        CustomQueue(int i){
            arr = new int[i];
            capacity = i;
            front = -1;
            rear = -1;
        }

        public void enQueue(int e){
            if( front == 0 && rear == capacity-1){
                System.out.println("Queue is full");
            }else {
                if(front == -1){
                    front = 0;
                }
                arr[++rear] = e;
            }
        }

        public void deQueue(){
            if (front == -1) {
                System.out.println("Queue is empty");
                System.exit(1);
            }else{
                int a = arr[front] ;
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                }
                System.out.println("Element dequeued : "+ a);
                front++;
            }

        }
        public void displayQueue(){
            if(front == -1){
                System.out.println("Queue is empty");
            }
            for(int i = front ; i<= rear; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }
    class DemoQueue{
        public static void main(String[] args) {
            CustomQueue q1 = new CustomQueue(5);
            q1.enQueue(10);
            q1.enQueue(20);
            q1.enQueue(30);
            q1.displayQueue();
            q1.deQueue();
            q1.displayQueue();
            q1.deQueue();
            q1.deQueue();
        }
    }



