import java.util.Scanner;

public class Leapyear {

    //WAP to input any year like 1989 and find out if it is leap year

    //Leap year a :2000
    // Java main method

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println( " Enter number :");
        int a = scanner.nextInt();
        //if year divided by 100 then it is leap year
         if (a %100 == 0)
         System.out.println( "Entered year is leap year");
         else
             System.out.println("Entered year is not leap year");



    }
}
