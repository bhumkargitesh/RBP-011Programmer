import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailIdValidator {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z0-9]+@[a-z.]+[a-z]$","giteshbhumkar@gmail.com"));
        Pattern p = Pattern.compile("[a-z0-9]+@[a-z.]+[a-z]$");
        Matcher m = p.matcher("giteshbhumkar123@gmail.com");
        System.out.println(m.matches());

    }
}
