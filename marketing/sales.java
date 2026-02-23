package Lab6.marketing;

import Lab6.general.employee;
import java.util.Scanner;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        sales s = new sales(empid, ename, basic);

        double totalEarnings = s.earnings() + s.tallowance();

        System.out.println("Emp ID: " + s.empid);
        System.out.println("Name: " + s.ename);
        System.out.println("Basic Salary: " + s.basic);
        System.out.println("Travel Allowance: " + s.tallowance());
        System.out.println("Total Earnings: " + totalEarnings);

        sc.close();
    }
}