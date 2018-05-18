package com.danilo.alura.com.danilo.alura.fluxo;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("MAIN BEGIN");
        m1();
        System.out.println("MAIN END");
    }

    public static void m1() {
        System.out.println("B BEGIN");
        m2();
        System.out.println("B END");
    }

    public static void m2() {
        System.out.println("A BEGIN");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int a = i / 0;
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException");
            }
        }
        System.out.println("A END");
    }
}
