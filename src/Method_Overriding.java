//import java.util.Scanner;
//
//public class Method_Overriding {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 for Batsman and 2 for bowler ");
//        int choice = sc.nextInt();
//        sc.close();
//        Cricketer c;
//        if(choice == 1){
//            c = new Batsman("India","Rohit Shrama",4,2);
//        }
//        else
//        {
//            c = new Bowler("india", "Bhumra", 3, 10);
//        }
//            c.Print();
//
//
//    }
//}
//class Cricketer{
//     String countryName;
//    String playerName;
//    public void Cricketer(String countryName,String playerName){
//        this.countryName=countryName;
//        this.playerName=playerName;
//    }
//    public void Print(){
//        System.out.println("Country Name:" +countryName);
//        System.out.println("Player Name:" +playerName);
//    }
//}
//class Batsman extends Cricketer{
//    int no50s;
//    int no100s;
//    public void Batsman(String  countryName,String  playerName,int no50s, int no100s){
//        super.Cricketer(countryName,playerName);
//        this.no50s=no50s;
//        this.no100s=no100s;
//    }
//    public void print(){
//        super.Print();
//        System.out.println("No of 50s:" +no50s);
//        System.out.println("No of 100s :"  +no100s);
//    }
//}
//class Bowler extends Cricketer{
//    int wickets;
//        int runs;
//    public void Bowler(String countryName,String playerName,int wickets,int runs){
//        super.Cricketer(countryName,playerName);
//        this.wickets=wickets;
//        this.runs=runs;
//    }
//    public void print(){
//        super.Print();
//        System.out.println("Number of Wickets :" +wickets);
//        System.out.println("Given the number of runs:"  +runs);
//    }
//}