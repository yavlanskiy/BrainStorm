package pattern.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuItem{
    private List<MenuItem> menuItems = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    @Override
    public void print() {
        System.out.println("=== " + name + " ===");
        for (MenuItem menuItem : menuItems) {
            menuItem.print();
        }
    }
}
