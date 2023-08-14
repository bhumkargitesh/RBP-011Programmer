import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplaceMethodDemo {
    public static void main(String[] args) {
        String s = ("i   am gitesh    bhumkar");
        Pattern p = Pattern.compile("\\s{2,}");
        Matcher m = p.matcher(s);
        String  replaces2 = m.replaceAll("");
        System.out.println("original String:"+s);
        System.out.println("Replace all String : " +replaces2);

        String replacef = m.replaceFirst("");
        System.out.println("Original String:" +s);
        System.out.println("Replace all String:"+replacef);

        String str = ("I have 1rs");
        Pattern p1= Pattern.compile("1rs");
        Matcher m1 = p1.matcher(str);
        String replace3 = m1.replaceAll(m1.quoteReplacement("$"));
        System.out.println("original String:" +str);
        System.out.println("replace all String:"+replace3);


    }
}
