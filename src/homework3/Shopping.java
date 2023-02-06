package homework3;

public class Shopping {

    /*
    Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
    Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true, если хотя бы
    один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
     */
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        if (isEdekaOpen && !isReweOpen){
            canBuy(isEdekaOpen);
            System.out.println("I can buy food, it is " + canBuy(isEdekaOpen));
        }
        else {
            canBuy(isReweOpen);
            System.out.println("I can buy food, it is " + canBuy(isReweOpen));
        }

    }
    private static boolean canBuy(boolean isEdekaOpen) {

        return isEdekaOpen;
    }


}
