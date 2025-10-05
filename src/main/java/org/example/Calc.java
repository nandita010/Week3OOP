package org.example;

public class Calc {
    //Adding
    public int add(int a, int b) {
        return a + b;
    }
//Subtracting
    public int sub(int a, int b) {
        return a - b;
    }
//Multiplying
    public int mul(int a, int b) {
        return a * b;
    }
//Dividing
    public double div(int a, int b) {
        return (double) a / b;
    }
//Modulo
    public int mod(int a, int b) {
        return a % b;
    }
    //Power

    public double pow(int a, int b) {
        return Math.pow(a, b);
    }
}