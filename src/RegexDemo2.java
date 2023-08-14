import java.util.regex.Matcher;
import java.util.regex.Pattern;

//StartEndMethodDemo
public class RegexDemo2 {
           public static void main(String [] args){
            int count = 0;
            Pattern p = Pattern.compile("L[a-z]*n");
            Matcher m = p.matcher("Dont Lean and Learn from the Best Expers at LearnVern and enjoy the ride of Learning");

            while(m.find()){
                count++;
                System.out.println("Count:" + count);
                System.out.println("Start():" + m.start());
                System.out.println("End():" + m.end());
            }
        }
    }

