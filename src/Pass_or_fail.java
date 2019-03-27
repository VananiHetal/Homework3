import java.util.Scanner;
// Find out pass or fail on basis of student needs to pass all the subjects
// Science, english,maths

public class Pass_or_fail {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);// Marks of english 60
        System.out.println("English");
        int English = scanner.nextInt();
        System.out.println("Maths"); //marks of maths 80

        int Maths = scanner.nextInt();
        System.out.println("Science"); // marks of science 85
        int Science = scanner.nextInt();
        if ( 35 <= English && 35 <= Maths && 35 <= Science) {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");


        }


    }
}
