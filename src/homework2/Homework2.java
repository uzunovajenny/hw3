package homework2;

public class Homework2 {

    public static void main(String[] args) {

        //Task 1
        // Перевести число 333 из шестнадцатиричной в десятичную

        int decimalNum1 = Integer.parseInt("333", 16);

        System.out.println("---------------------------------------\n" + "Task 0. \n" +
                "333 из шестнадцатиричной системы в десятичную - " + decimalNum1);


        // Разложить число 200345 на разряды в десятичной системе

        int hundreds = 200345 % 100;
        int tens = (200345 / 100) % 10;
        int ones = (200345 / 1000) % 10;
        int tenths = (200345 / 10000) % 10;
        int hundredths = (200345 / 100000) % 10;
        int thousandths = (200345 / 1000000) % 10;

        System.out.println("-------------------------------------\n" +
                "Task 1. 200345 разбить на разряды в десятичной системе: \n" + "Сотни: " + hundreds + "\n" + "Десятки: "
                + tens + "\n" + "Еденицы: " + ones + "\n" + "Десятые: " + tenths + "\n" + "Сотые: " + hundredths + "\n"
                + "Тысячные: " + thousandths);


        //Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)

        int decimalNum2 = 637;
        String conv = Integer.toHexString(decimalNum2);
        System.out.println("-------------------------------------\n" + "Task 2. \n" +
                "637 из десятичной системы в шестнадцатиричную - " + conv);

        String hex = "27D";
        int ten = Integer.parseInt(hex, 16);
        System.out.println("27D из шестнадцатиричной системы в десятичную - " + ten);


        //Перевести 637 из десятичной в двоичную

        int decimalNum3 = 637;
        String convertor;
        convertor=Integer.toBinaryString(decimalNum3);
        System.out.println("-------------------------------------\n" + "Task 3. \n" + "637 в двоичной системе - "
                + convertor);


        //11100111 перевести в десятичную

        int decimalNum4 = Integer.parseInt("11100111", 2);
        System.out.println("--------------------------------------\n" + "Task 4. \n" +
                "11100111 в десятичной системе - " + decimalNum4);


        //Перевести 637 из десятичной в троичную

        int decimalNum5 = 637;
        String threeRankNum = Integer.toString(decimalNum5, 3);
        System.out.println("--------------------------------------\n" + "Task 5. \n" + "637 в троичной системе - "
                + threeRankNum);



        //Task 2
        //1. Создайте строку через new - I study Basic Java!

        String text = new String("I study Basic Java!");
        System.out.println("--------------------------------------\n" + text);
        System.out.println(text.length());

        StringMethodsTest(text);


        CalculatorDemo(args);
    }

    //2. Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую
    // создали в п.1

    public static void StringMethodsTest (String text) {

        //3. Распечатать последний символ строки. Используем метод String.charAt().

        System.out.println("---------------------------------------\n" + text.charAt(18));


        //4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        String testString = "Java";
        System.out.println("---------------------------------------\n" + text.contains(testString));

        //5. Заменить все символы “а” на “о”.

        String newString = testString.replace('a' , 'o');
        System.out.println("---------------------------------------\n" + newString);

        //6. Преобразуйте строку к верхнему регистру.

        String textUpperCase = text.toUpperCase();
        System.out.println("---------------------------------------\n" + textUpperCase);

        //7. Преобразуйте строку к нижнему регистру.

        String textLowerCase = text.toLowerCase();
        System.out.println("---------------------------------------\n" + textLowerCase);

        //8. Вырезать строку Java c помощью метода String.substring().

        String subString = text.substring(14,18);
        System.out.println("---------------------------------------\n" + subString);




        //Task 3
        //1. Bведите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
        // Получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на
        // консоль.

        String word1 = "name";
        String word2 = "symbol";

        String subText = word1.substring(0,2) + word2.substring(2);

        System.out.println("--------------------------------------------");
        System.out.println(subText);

    }

    //2. Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел.
    // Каждая из арифметических операций должна быть реализована как отдельный метод.
    public static void CalculatorDemo (String[] args){

        int a = 5;
        int b = 10;

        System.out.println("----------------------------------");
        System.out.println("Addition: " + add(a,b));
        System.out.println("Subtraction: " + subtract(a,b));
        System.out.println("Multiplication: " + multiply(a,b));
        System.out.println("Division: " + divide(a,b));

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        return (double)a/b;
    }

}
