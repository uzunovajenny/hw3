package homework3;

public class Device {

    /*
    Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы
     выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это
     устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение
     true или false.
     */

    public static void main(String[] args) {

        int temperature1 = 101;
        int temperature2 = 99;

        checkDevice(temperature1, temperature2);

    }
    public static void checkDevice(int temperature1, int temperature2) {

        System.out.println(temperature1 > 100 && temperature2 < 100);

    }
}


