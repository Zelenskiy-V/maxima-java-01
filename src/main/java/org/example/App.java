package org.example;


public class App
{
    public static void main( String[] args )
    {
        int a=10;
        int b=30;
        System.out.println("исходный");
        System.out.println(a);
        System.out.println(b);

        int res = a;
        a = b;
        b = res;

        System.out.println("обработано");
        System.out.println(a);
        System.out.println(res);

    }
}