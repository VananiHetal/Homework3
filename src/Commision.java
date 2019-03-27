import java.util.Scanner;

public class Commision {

    //Input sales id,seller's name, sales amount,bsic salary and find sales commision

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        double salesamount, basicsalary, commission;
        double commissionrate = 0.0;
        System.out.println("Enter sales id"); //sales Id is 5555

        int id = scanner.nextInt();  // seller name is Mark
        System.out.println("Enter  seller name");
        String name = scanner.next();            // 60000
        System.out.println("Enter sales amount");
        salesamount = scanner.nextDouble();

        System.out.println("Enter basicsalary");// 36000

        basicsalary = scanner.nextDouble();

        if (salesamount >= 50000) commissionrate = 0.35;
        else if (salesamount >= 30000) commissionrate = 0.20;

        else if (salesamount >= 20000) commissionrate = 0.10;
        else if (salesamount >= 10000) commissionrate = 0.05;
        else commissionrate = 0.02;
        commission = commissionrate * salesamount;

        System.out.println("commission is :" + commission);
    }


}
