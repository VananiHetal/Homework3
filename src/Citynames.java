import java.util.Scanner;

public class Citynames {

    public static void main(String[] args ){
        String a,b,c,d,e,f,A,B,C,D,E,F;
        char  ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any alphabet from A to F:");
        ch = scanner.next().charAt(0);


        if (ch == 'A'|| ch == 'a')
        {
            System.out.println("Anand");
        }
        else if (ch == 'B'|| ch == 'b'){
            System.out.println("Bardoli");
        }
        else if (ch == 'C'|| ch == 'c'){
            System.out.println("Chennai");
        }
        else if (ch == 'D'|| ch == 'd'){
            System.out.println("Dang");
        }
        else if (ch == 'E'|| ch == 'e') {
            System.out.println("Egatpur");
        }
        else if (ch == 'F'|| ch == 'f'){
            System.out.println("Firozabad");
        }
        else
        {
            System.out.println("Invalid entry");

        }









    }
}
