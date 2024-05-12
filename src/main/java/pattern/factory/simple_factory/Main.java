package pattern.factory.simple_factory;

import pattern.factory.simple_factory.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new UserFactory().createUser(UserType.CUSTOMER);
        user.say();
    }
}
