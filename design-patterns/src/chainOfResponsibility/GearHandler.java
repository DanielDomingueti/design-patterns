package chainOfResponsibility;

public abstract class GearHandler {

    protected GearHandler gearHandlerSucessor;

    public void setGearHandlerSucessor(GearHandler gearHandlerSucessor) {
        this.gearHandlerSucessor = gearHandlerSucessor;
    }

    public abstract void handleRequest(int rpm);

}
