import java.util.Scanner;

public class Turneryoperator {

    //Input any two number and find out its odd or even turnery operator.

    //Java main method

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("Enter a number :");
        String  evenOdd = (a % 4 == 0 ) ? "even" : "odd";
        System.out.println( a + " is " + evenOdd);


    }
}
