// 2.Write a program to:

// Check if a number entered by the user is equal or not using Comparison Operator

import java.util.Scanner;

public class Comparisonoperator {
   public static void main(String[] args){

   Scanner src = new Scanner(System.in);

   System.out.println("enter 1st num : ");
   int a = src.nextInt();
  
     System.out.println("enter 2nd num : ");
     int b = src.nextInt();


       //Relational  Operators
        System.out.println("Relational  Operators :- ");
         System.out.println("eqals to : "+(a==b));
         System.out.println("Not equal to : "+(a!=b));
         System.out.println("Greater than : "+(a>b));
         System.out.println("Less than : "+(a<b));
         System.out.println("Greater or equal : "+(a>=b));
         System.out.println("Less or equal : "+(a<=b));



   }
    
}
