import java.util.Scanner;

public class Uppercase_lovercase {

    // Input alphabet in uppercase and print in lower case

    public static void main(String[]args ){

        Scanner scanner = new Scanner (System.in);
        char ch;
        int temp;
        System.out.println("Enter a character in Uppercase");
        ch= scanner.next().charAt(0);

        temp = (int) ch;
        temp = temp +32;
        ch = (char) temp;

        System.out.println("Enter equivalent character in Lower =" + ch);


    }
}
