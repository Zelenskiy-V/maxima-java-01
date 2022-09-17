package org.example;


public class Fn {


    public static void main(String[] args) {

        System.out.println(daysCount(2, 2020));

    }

    public static String daysCount(int month, int year) { // обьявление метода - создание, возвращаемыйТип названиеМетода(параметрыМетода), - сигнатура
        String result = ""; // созданиеПеременной типа стринг Тип названиеПеременной
        switch (month) { // Передает переменную месяца
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
                if (isYearVes(year)){ // Вызываю метод isYearVes(year) для вызова метода названиеМетода(параметры);
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

//            case 2:
//                if (isLeapYear(year)) {
//                    days = "29";
//                } else {
//                    days = "28";
//                }
//                break;






