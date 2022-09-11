package org.example;

public class Fn {
    public static void main(String[] args) {
        System.out.println(fibonazzi((byte) 45 ));
    }

    public static long fibonazzi(byte n) {
        if (n == 1 || n == 0) return n;

        return fibonazzi((byte)(n - 1)) + fibonazzi((byte)(n - 2));
    }

}
