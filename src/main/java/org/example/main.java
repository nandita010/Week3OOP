//Nandita
package org.example;
import java.util.Scanner;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create an instance of a Calculator

        Calc calc = new Calc();

        System.out.println("Simple Calculator-Finding Power with Two Numbers");
        System.out.println("Please choose an operation(+, -, *, /, %, power): ");
        String operator = sc.next();
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        double result = 0;
//Operations using if statement
        if (operator.equals("+")) {
            result = calc.add(a, b);
        } else if (operator.equals("-")) {
            result = calc.sub(a, b);
        } else if (operator.equals("*")) {
            result = calc.mul(a, b);
        } else if (operator.equals("/")) {
            result = calc.div(a, b);
        } else if (operator.equals("%")) {
            result = calc.mod(a, b);
        } else if (operator.equals("power")) {
            result = calc.pow(a, b);
        } else {
            System.out.println("Invalid operation, please try again:");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}