package pattern.command;

public class LightImpl implements Liqht {
    @Override
    public void turnOn() {
        System.out.println("The light is on");
    }
    @Override
    public void turnOff() {
        System.out.println("The light is off");
    }
}
