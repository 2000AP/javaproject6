package com.company;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.print(a + ", " + b); //prints value of a & b
        for (int i = 2; i <= 10; i++) {
            c = a + b; //create c value
            System.out.print(", " + c); //print value of c
            a = b; //replace value of b to a
            b = c; //replace value of c to b
        }

    }
}
