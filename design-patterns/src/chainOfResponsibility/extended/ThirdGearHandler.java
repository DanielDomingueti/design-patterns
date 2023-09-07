package chainOfResponsibility.extended;

import chainOfResponsibility.GearHandler;

public class ThirdGearHandler extends GearHandler {

    protected int RPM_CAPACITY = 3000;


    @Override
    public void handleRequest(int rpm) {
        if (rpm <= RPM_CAPACITY) {
            System.out.println("Third gear at " + rpm + " out of RPM: " + RPM_CAPACITY);
        }
        else if (gearHandlerSucessor != null) {
            gearHandlerSucessor.handleRequest(rpm);
        }
    }
}
