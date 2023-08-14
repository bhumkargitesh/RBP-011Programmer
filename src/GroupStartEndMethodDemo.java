import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupStartEndMethodDemo {
    public static void main(String [] args){
        Pattern p = Pattern.compile("(Learn)(Vern)");
        Matcher m = p.matcher("Learn from the Best Expert at LearnVern and Enjoy the Ride of Learning");

        while(m.find()){
            System.out.println("Start() of Group 0: " + m.start(0));
            System.out.println("Start() of Group 1: " + m.start(1));
            System.out.println("Start() of Group 2: " + m.start(2));

            System.out.println("End() of Group 0: " + m.end(0));
            System.out.println("End() of Group 1: " + m.end(1));
            System.out.println("End() of Group 2: " + m.end(2));
        }
    }
}
