package pattern.factory.simple_factory.model;

public class Admin extends User{
    /**
     *
     */
    @Override
    public void say() {
        System.out.println("I am Admin");
    }
}
