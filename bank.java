package Lab6;
import java.util.Scanner;

class Bank {

    String bankName;              // Non-static member
    static String branch = "Main Branch";   // Static member

    // Constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Static Nested Class
    static class InterestCalculator {

        // Static method to calculate Simple Interest
        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        public void displayBankDetails() {

            // ❌ Cannot access non-static member directly
            // System.out.println(bankName);  // This would give compile-time error

            // ✅ Can access static member directly
            System.out.println("Branch Name: " + branch);

            // ✅ To access non-static member, create object of outer class
            Bank b = new Bank("State Bank of India");
            System.out.println("Bank Name: " + b.bankName);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank Name:");
        String name = sc.nextLine();

        System.out.println("Enter Principal Amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (in years):");
        double time = sc.nextDouble();

        // Creating outer class object
        Bank bank = new Bank(name);

        // Calling static method of static nested class
        double si = Bank.InterestCalculator
                .calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest: " + si);

        // Creating object of static nested class
        Bank.InterestCalculator ic = new Bank.InterestCalculator();
        ic.displayBankDetails();

        sc.close();
    }
}
