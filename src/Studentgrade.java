import java.util.Scanner;

public class Studentgrade {

    //WAP to input student name,roll no,3 subjects marks,find out total,percentage,result if he is pass or fail a
    //also give a grad on basis of percentage.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name"); //first name Anna
        String name = scanner.next();

        System.out.println("Enter roll no"); //roll no: 50
        int a = scanner.nextInt();//
        System.out.println("Enter marks of science"); // Marks of science = 60/out of 100
        int science = scanner.nextInt();
        System.out.println("Enter marks of maths"); // Marks of maths = 80/out of  100
        int maths = scanner.nextInt();
        System.out.println("Enter marks of english"); // marks of english = 85/out of 100
        int english = scanner.nextInt();
        System.out.println(" total marks of 3 " + science + " and " + maths + " and " + english + " = " + (science + maths + english));
        float total, Percentage;
        total = english + science + maths;
        Percentage = (total / 300) * 100;
        System.out.println("Marks Percentage = " + Percentage);

        if (Percentage >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        char grade;

        if (Percentage >= 80) {
            System.out.println("A+ grade");

        } else if (Percentage >= 60 && Percentage < 80) {
            System.out.println("A grade");
        } else if (Percentage >= 50 && Percentage < 60) {
            System.out.println("B grads");
        } else if (Percentage >= 35 && Percentage < 50) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");
        }
    }

}





