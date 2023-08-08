import java.util.Arrays;
import java.util.List;
public class JavaReduce {
    public static void main(String[] args) {
        List<Integer> ListElements = Arrays.asList(6,9,10,3,7,3,2);
        Integer value =ListElements.stream().reduce((a,b)->a*b).get();
        System.out.println(value);
        
        }

    }

