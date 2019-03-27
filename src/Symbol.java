import java.util.Scanner;

public class Symbol {
    // Enter two numbers and
    //Enter symbol(+.-./.*) and find add,sub,multiplication and division according to symbol

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            int x,y,Ans;
            char ch;
            System.out.println("Enter number 1:");
            x = scanner.nextInt();
            System.out.println("Enter number 2:");
            y = scanner.nextInt();
            System.out.println("Enter +.-.*./:  ");
            ch = scanner.next().charAt(0);
            if (ch == '+')
            {
                Ans = x+y;
                System.out.println("Answer is = " +Ans);
            }
            else if (ch == '-') {
                Ans = x - y;
                System.out.println("Answer is = " + Ans);
            }
            else if (ch == '*') {
                Ans = x * y;
                System.out.println("Answer is = " + Ans);
            }
            else if (ch == '/') {
                Ans = x / y;
                System.out.println("Answer is = " + Ans);
            }
            else
                {
                    System.out.println( " Wrong symbol");




            }


    }

}
