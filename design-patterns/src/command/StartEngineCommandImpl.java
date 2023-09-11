package command;

public class StartEngineCommandImpl implements Command {

    private Engine engine;

    public StartEngineCommandImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.start();
    }
}
