package Homework2;

import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {

        // Перевести число 333 из шестнадцатиричной в десятичную

        int decimalNum1 = Integer.parseInt("333", 16);

        System.out.println("---------------------------------------");
        System.out.println("Task 0. ");
        System.out.println("333 из шестнадцатиричной системы в десятичную - " + decimalNum1);



        // Разложить число 200345 на разряды в десятичной системе

        int hundreds = 200345 % 100;
        int tens = (200345 / 100) % 10;
        int ones = (200345 / 1000) % 10;
        int tenths = (200345 / 10000) % 10;
        int hundredths = (200345 / 100000) % 10;
        int thousandths = (200345 / 1000000) % 10;

        System.out.println("-------------------------------------");
        System.out.println("Task 1. 200345 разбить на разряды в десятичной системе: ");
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Еденицы: " + ones);
        System.out.println("Десятые: " + tenths);
        System.out.println("Сотые: " + hundredths);
        System.out.println("Тысячные: " + thousandths);



        //Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)

        int decimalNum2 = 637;
        String conv = Integer.toHexString(decimalNum2);
        System.out.println("-------------------------------------");
        System.out.println("Task 2. ");
        System.out.println("637 из десятичной системы в шестнадцатиричную - " + conv);

        String hex = "27D";
        int ten = Integer.parseInt(hex, 16);
        System.out.println("27D из шестнадцатиричной системы в десятичную - " + ten);



        //Перевести 637 из десятичной в двоичную

        int decimalNum3 = 637;
        String convertor;
        convertor=Integer.toBinaryString(decimalNum3);
        System.out.println("-------------------------------------");
        System.out.println("Task 3. ");
        System.out.println("637 в двоичной системе - " + convertor);



        //11100111 перевести в десятичную

        int decimalNum4 = Integer.parseInt("11100111", 2);
        System.out.println("--------------------------------------");
        System.out.println("Task 4. ");
        System.out.println("11100111 в десятичной системе - " + decimalNum4);



        //Перевести 637 из десятичной в троичную

        int decimalNum5 = 637;
        String threeRankNum = Integer.toString(decimalNum5, 3);
        System.out.println("--------------------------------------");
        System.out.println("Task 5. ");
        System.out.println("637 в троичной системе - " + threeRankNum);

    }

}
