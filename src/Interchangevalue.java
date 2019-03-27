import java.util.Scanner;

public class Interchangevalue {
    // wap to input any tweo number and then print their interchanged value

    //java main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value x"); // x value 40
        int x = scanner.nextInt();
        System.out.println("Enter value y");//y value 50
        int y = scanner.nextInt();
        System.out.print("Enter Value of x and y ");

        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping\nx = " + x + "\ny = " + y);



    }
}