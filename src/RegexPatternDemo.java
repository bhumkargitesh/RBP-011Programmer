import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternDemo {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the alphabet");
        str = sc.nextLine();
        Pattern p = Pattern.compile("[a-eA-E]");// all letter true any case but A to e in between
        Matcher m = p.matcher(str);
        System.out.println("is it String range correct a-e? " +m.matches());
    }
}
//[^a-e] it is not except letter in between (a to e)