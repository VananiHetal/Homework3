import java.util.Scanner;

public class Vowel_consonant {

    //Print vowel or consonant from the alphabet

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character");
        char ch = scanner.next().charAt(0);
        if
        (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Entered character " + ch + " is Vowel");
        else
            System.out.println("Entered charatcet " + ch + " is Consonant");
    }
}




