
public class CustomStack {
    int arr[];
    int top;
    int capacity;

    CustomStack(int i){
        arr = new int[i];
        capacity = i;
        top = -1;
    }

    public void push(int e){
        if(top == arr.length-1){
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Element inserted");
        arr[++top] = e;
    }

    public void displayStack(){
        for(int i = 0; i<= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("Element popped: "+ arr[top]);
        int a = arr[top];
        top--;

    }

}

class DemoStack{
    public static void main(String[] args) {
        CustomStack s1 = new CustomStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.displayStack();
        s1.pop();
        s1.displayStack();



    }
}