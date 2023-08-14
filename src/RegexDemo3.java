import java.util.regex.Matcher;
import java.util.regex.Pattern;
//lookat,find , find Start,Matcher.
public class RegexDemo3 {
    public static void main(String [] args) {
        Pattern pattern = Pattern.compile("LV");

        Matcher matcher = pattern.matcher("I said that LV Stands for LearnVern");

        if (matcher.lookingAt())
            System.out.println("LV Found at Beginnning");
        else
            System.out.println("LV is not at the Beginning");

        if (matcher.find())
            System.out.println("LV is there in the string");
        else
            System.out.println("LV is not present in the string");

        if (matcher.find(5))
            System.out.println("LV is there in the string after 5th Character");
        else
            System.out.println("LV is not present in the string after 5th Index");

        if (matcher.matches())
            System.out.println("String follows the Pattern of LV");
        else
            System.out.println("String Does not follow the Pattern of LV");

    }

    }
