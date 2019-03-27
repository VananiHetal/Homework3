import java.util.Scanner;

public class Emplyee_salary {

    // Input employee id,name,basic salary, then find HRA,TA,DA,PF,Gross salary.

    public static void main(String[] args){
       double basicsalary,HRA,DA,TA,PF,Grosssalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID"); ///Employee ID :5555
        int id = scanner.nextInt();
        System.out.println("Enter employee name");// Employee name :peter
        String name = scanner.next();
        System.out.println("Enter basicsalary:");//basic salary :60000
        basicsalary = scanner.nextDouble();

        HRA = (basicsalary*10)/100;
        DA = (basicsalary*8)/100;
        TA = (basicsalary*9)/100;
        PF = (basicsalary*20)/100;

        Grosssalary= basicsalary+HRA+DA+TA-PF;

        System.out.println("HRA:" +HRA);
        System.out.println("DA :" +DA);

        System.out.println("TA;" +TA);
        System.out.println("PF:" +PF);













    }


}
