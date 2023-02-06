package homework3;

public class Walking {
    /*
    Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
    если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
     */
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        questionAndAnswer(isWeekend, isRain);

    }

    private static void questionAndAnswer(boolean isWeekend, boolean isRain) {

        boolean canWalk = isWeekend && !isRain;

        System.out.println("I can go walk, it is " + canWalk);

    }





}
