package chainOfResponsibility.extended;

import chainOfResponsibility.GearHandler;

public class RpmOutOfRangeHandler extends GearHandler {

    @Override
    public void handleRequest(int rpm) {
        System.out.println("There's no existing gear for such rpm: " + rpm);
    }
}
