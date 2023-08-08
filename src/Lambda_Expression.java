import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface LambdaDemoFunction{
    int call(int a);

}
public class Lambda_Expression {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,6,8,6,30);

        LambdaDemoFunction f1 = (i)-> i+2;
        LambdaDemoFunction f3 = (i) -> i*50;

        printValue(6,f3);

        System.out.println(f1);

    }
    public static void printValue(int a, LambdaDemoFunction f2){
        int b = f2.call(6);
        System.out.println(b);
    }
}

// Higher Order Function

// A function/method in which we pass another function as a parameter or we return a function or both of it is called a higher order function.

