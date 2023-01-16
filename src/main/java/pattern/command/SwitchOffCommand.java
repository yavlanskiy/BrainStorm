package pattern.command;

public class SwitchOffCommand implements Command{

    @Override
    public void execute(LightImpl light) {
        light.turnOff();
    }
}
