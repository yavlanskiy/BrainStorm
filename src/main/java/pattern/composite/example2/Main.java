package pattern.composite.example2;

public class Main {
    public static void main(String[] args) {

        Menu mainMenu = new Menu("Основное меню");
        mainMenu.addMenuItem(new SimpleMenuItem("Стейк", 1000.0));
        mainMenu.addMenuItem(new SimpleMenuItem("Салат", 200.0));

        Menu dessertMenu = new Menu("Десерты");
        dessertMenu.addMenuItem(new SimpleMenuItem("Пирог", 150.0));
        dessertMenu.addMenuItem(new SimpleMenuItem("Мороженое", 100.0));

        Menu allMenus = new Menu("Все меню");
        allMenus.addMenuItem(mainMenu);
        allMenus.addMenuItem(dessertMenu);

        allMenus.print();
    }
}
