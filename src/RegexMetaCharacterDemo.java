import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaCharacterDemo {
    public static void main(String[] args) {
        // \d -- any digit,short of[0-9]

        System.out.println("\\d -- any digit,short of[0-9]");

        System.out.println(Pattern.matches("\\d","a"));  //false
        System.out.println(Pattern.matches("\\d","9"));   //true
        System.out.println(Pattern.matches("\\d","90"));    //false
        System.out.println(Pattern.matches("\\d+","90"));   //true

        // \D-- any non digit,short of [0-9]

        System.out.println(" \\D-- any non digit,short of [0-9]");

        System.out.println(Pattern.matches("\\D","a"));  //true
        System.out.println(Pattern.matches("\\D","9"));   //false
        System.out.println(Pattern.matches("\\D","abcd"));    //false
        System.out.println(Pattern.matches("\\D+","abcd"));   //true
        System.out.println(Pattern.matches("\\D","A"));   //true

        //----\\b-- A word boundry.

        System.out.println("\\b---A word boundry");

        Pattern p = Pattern.compile("\\bLearn\\b");
        Matcher m = p.matcher("I want to Learn java from Bridgelabz");
        System.out.println(m.find());

        //----\\B-- A non word boundry.

        System.out.println("\\B---A non word boundry");

        Pattern p1 = Pattern.compile("\\BLearn\\B");
        Matcher m1 = p1.matcher("I want to Learn java from Bridgelabz");
        System.out.println(m1.find());

       // \\w -- any word character,short for[a-zA-Z_0-9]

        System.out.println("\\w -- any word character,short for[a-zA-Z_0-9]");

        System.out.println(Pattern.matches("\\w","a"));  //true
        System.out.println(Pattern.matches("\\w","A"));   //true
        System.out.println(Pattern.matches("\\w","0"));    //true
        System.out.println(Pattern.matches("\\w","90")); //false
        System.out.println(Pattern.matches("\\w","Ap9"));    //false
        System.out.println(Pattern.matches("\\w","("));   //false


        // \\w -- any non word character,short for[^\w]

        System.out.println("\\w -- any non word character,short for[^\\w]");

        System.out.println(Pattern.matches("\\W","a"));  //false
        System.out.println(Pattern.matches("\\W","A"));   //false
        System.out.println(Pattern.matches("\\W","0"));    //false
        System.out.println(Pattern.matches("\\W","90")); //false
        System.out.println(Pattern.matches("\\W","Ap9"));    //false
        System.out.println(Pattern.matches("\\W","("));   //true








    }
}
