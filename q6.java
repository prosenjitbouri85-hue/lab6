package Lab6;

import java.util.Scanner;

// Interface
interface Greeting {
    void sayHello();
}

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Anonymous Inner Class Implementation
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, " + name + "! Welcome to Java Programming.");
            }
        };

        // Calling method
        g.sayHello();

        sc.close();
    }
}