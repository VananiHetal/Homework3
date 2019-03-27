import java.util.Scanner;

public class Avarageofnumber {

    //wap input any five number and then find average of five numbers

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a :");// a = 30
        int a = scanner.nextInt();

        System.out.println("Enter number b :"); // b = 40
        int b = scanner.nextInt();
        System.out.println("Enter number c :"); // c = 35
        int c = scanner.nextInt();
        System.out.println("Enter number d :"); // d = 32
        int d = scanner.nextInt();
        System.out.println("Enter number e :"); // e = 29
        int e = scanner.nextInt();
        System.out.println("Avarage of five number is " +(a + b + c + d +e )/ 5);




    }

}
