import java.util.Scanner;

public class Posnegzero {
    ///WAP to input any mumber and then find if it is pos, neg or zero
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x :"); //number x = 100

        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Number is positive");
        } else if (x < 0) {

            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
