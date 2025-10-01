//Nandita
package org.example;
import java.util.Scanner;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create an instance of a Calculator

        Calc calc = new Calc();

        System.out.println("Simple Calculator-Subtracting Two Numbers");
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int result= calc.sub(a, b);
        System.out.println("Result:" +result);

        sc.close();
    }
}
