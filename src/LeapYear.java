// Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
import java.util.Scanner;

public class LeapYear {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (isleapyear(year)){
            System.out.println(year + "yes,is a leap year" );
        }else{
            System.out.println(year + "no, it is not leap year" );
        }
    }
    public static boolean isleapyear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 ==0 ){
                    return true;
                }
                else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}
