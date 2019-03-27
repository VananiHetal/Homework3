import java.util.Scanner;

public class Alpha_symbol {

    // Enter any value and find out if it is number or alphabet or symbol

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number.alphabet or symbol ");
        String input = scanner.nextLine();

        if (input.matches("[a-zA-Z]") )
        {
        System.out.println("Alphabet");
        }
        else if (input.matches("[0-15]") )
        {
            System.out.println("Number");
        }
        else
            {
                System.out.println("Symbol");


    }
    }
}
