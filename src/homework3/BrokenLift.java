package homework3;

public class BrokenLift {

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
