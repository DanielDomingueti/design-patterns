package chainOfResponsibility;

import chainOfResponsibility.extended.FirstGearHandler;
import chainOfResponsibility.extended.RpmOutOfRangeHandler;
import chainOfResponsibility.extended.SecondGearHandler;
import chainOfResponsibility.extended.ThirdGearHandler;

import java.util.Scanner;

public class GearHandlerExecution {

    //use case: multiple if else() statement at once
    //behavioral design pattern

    public static void main(String[] args) {
        GearHandler firstGearHandler = new FirstGearHandler();
        GearHandler secondGearHandler = new SecondGearHandler();
        GearHandler thirdGearHandler = new ThirdGearHandler();
        GearHandler rpmOutOfRangeHandler = new RpmOutOfRangeHandler();

        firstGearHandler.setGearHandlerSucessor(secondGearHandler);
        secondGearHandler.setGearHandlerSucessor(thirdGearHandler);
        thirdGearHandler.setGearHandlerSucessor(rpmOutOfRangeHandler);

        Scanner scanner = new Scanner(System.in);
        int rpm;

        System.out.println("Type in a RPM or 0 to exit");

        do {
            rpm = scanner.nextInt();
            firstGearHandler.handleRequest(rpm);
        } while (rpm != 0);

        scanner.close();
    }
}