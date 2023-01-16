package pattern.command;

public class SwitchOffCommand implements Command{

    @Override
    public void execute(Liqht light) {
        light.turnOff();
    }
}
