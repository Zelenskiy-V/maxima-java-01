package org.example;


public class App {


    public static void main(String[] args) {

        System.out.println(daysCount((byte) 2, 2020));

    }

    public static String daysCount(byte month, int year) {
        String result = "";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30";
                break;
            case 2:
                if (isYearVes(year)){
                    result = "29";
                    break;
                } else {
                    result ="28";
                    break;
                }
        }
        return "В месяце " + month + " года " + year + " " + result + " дней" ;
    }

    public static boolean isYearVes(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }



}




