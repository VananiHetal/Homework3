import java.util.Scanner;

public class Votting {

    //User should be able to vote if user is = or over 18 years old
    //java main method
    public static void main(String[] args){

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age:");
        age = scanner.nextInt();
        if (age >= 18)
        System.out.println(" eligible to vote");
        else
            System.out.println("not eligible to vote");


    }
}
