package chainOfResponsibility.extended;

import chainOfResponsibility.GearHandler;

public class SecondGearHandler extends GearHandler {

    protected int RPM_CAPACITY = 2000;

    @Override
    public void handleRequest(int rpm) {
        if (rpm <= RPM_CAPACITY) {
            System.out.println("Second gear at " + rpm + " out of RPM: " + RPM_CAPACITY);
        }
        else if (gearHandlerSucessor != null) {
            gearHandlerSucessor.handleRequest(rpm);
        }

    }
}
