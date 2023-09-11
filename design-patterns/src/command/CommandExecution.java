package command;

public class CommandExecution {

    //use case: asynchronous operations - separate a operation's solicitation and execution
    //behavioral design pattern

    public static void main(String[] args) {

        final Engine engine = new Engine();
        final Command startEngineCommand = new StartEngineCommandImpl(engine);
        final Command stopEngineCommand = new StopEngineCommandImpl(engine);

        ControlPanel controlPanel = new ControlPanel();
        controlPanel.addCommand(startEngineCommand);
        controlPanel.addCommand(stopEngineCommand);

        controlPanel.executeCommands();
    }
}