package command;

public class StopEngineCommandImpl implements Command {

    private Engine engine;

    public StopEngineCommandImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.stop();
    }
}
