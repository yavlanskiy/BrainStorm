package java8.autoQA.A1;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private String pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
}
