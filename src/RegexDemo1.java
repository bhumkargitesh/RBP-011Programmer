import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("G[a-zA-Z]*r");
        Matcher m =p.matcher("GiteshBhumkar");
        boolean ismatched = m.matches();

        if (ismatched){
            System.out.println("String is matched");
        }else {
            System.out.println("String is not matched");
        }

    }
}
