import java.util.regex.Pattern;

public class RegexPatternQuantifiersDemo {
    public static void main(String [] args){
//		boolean isMatched = Pattern.matches("[0-9]?","6");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]?","68");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]?","Y");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]?","");
//		System.out.println(isMatched);
//
//		boolean isMatched = Pattern.matches("[0-9]+","6");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]+","68");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]+","68Y");
//		System.out.println(isMatched);
//
//		isMatched = Pattern.matches("[0-9]+","");
//		System.out.println(isMatched);


		boolean isMatched = Pattern.matches("[0-9]*","6");
		System.out.println(isMatched);

		isMatched = Pattern.matches("[0-9]*","68");
		System.out.println(isMatched);

		isMatched = Pattern.matches("[0-9]*","679y");
		System.out.println(isMatched);

		isMatched = Pattern.matches("[0-9]*","");
		System.out.println(isMatched);

//        String mobileNo;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Your Mobile Number");
//        mobileNo = sc.nextLine();
//        System.out.println(isValidMobile(mobileNo));

    }
//    public static boolean isValidMobile(String mb){
//        return Pattern.matches("[6-9][0-9]{9}",mb);
//    }
}


