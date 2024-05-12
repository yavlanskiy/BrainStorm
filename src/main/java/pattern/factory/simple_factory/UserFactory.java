package pattern.factory.simple_factory;

import pattern.factory.simple_factory.model.Admin;
import pattern.factory.simple_factory.model.Customer;
import pattern.factory.simple_factory.model.Manager;
import pattern.factory.simple_factory.model.User;



public class UserFactory {
    public User createUser(UserType type) {
        switch (type) {
            case ADMIN:
                return new Admin();
            case MANAGER:
                return new Manager();
            case CUSTOMER:
                return new Customer();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
