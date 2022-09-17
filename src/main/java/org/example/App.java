package org.example;


public class App {


    public static void main(String[] args) {

        System.out.println(daysCount((byte)2, 2024));

    }

    public static byte daysCount(byte month, int year) {
        byte result=0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result  = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                result= isYearVes(year) ? (byte) 29: (byte) 28;
        }
        return result;
    }
    public static boolean isYearVes(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }



}

