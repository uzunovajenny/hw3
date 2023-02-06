package homework3;

public class BrokenLift {
    /*
    сломанный лифт
    лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
    Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.
    Пример:
    Ввод:
    H = 200, N = 50, M = 1
    Ответ: 5
    Объяснение:
    Первый подьем: 50 - 1 = 49
    Второй подьем: 49 + 50 - 1 = 98
    Третий подьем: 98 + 50 - 1 = 147
    Четвертый подьем: 147 + 50 - 1 = 196
    Пятый подьем: выйти за пределы H.
    реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
     */
    public static void main(String[] args) {

        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;

        int currentFlow = 0;

        int dayCounter=0;

        while (currentFlow < floor) {

            dayCounter++;

            currentFlow = currentFlow + stepUp;

            if (currentFlow >= floor) {
                break;
            }
            currentFlow = currentFlow - stepDown;
        }

        System.out.println("You need " + dayCounter + " days");

    }

    public int numberOfLifts(int floor, int stepUp, int stepDown) {

        int result = 0;
        int stepFloors = 0;

        while (stepFloors < floor) {
            stepFloors += stepUp - stepDown;
            result++;
        }

        return result;

    }

}
