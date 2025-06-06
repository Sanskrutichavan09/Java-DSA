//1.Write a program to:

// Take 2 numbers as input from the user and Print their sum, difference, product, quotient, and remainder



import java.util.Scanner;
public class Arithmatic {
     public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = src.nextInt();

        System.out.print("Enter second number: ");
        int num2 = src.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("difference: " + (num1 - num2));
        System.out.println("product: " + (num1 * num2));
        System.out.println("quotient: " + (num1 / num2));
        System.out.println("remainder: " + (num1 % num2));

    }
}
