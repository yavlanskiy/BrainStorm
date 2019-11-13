package examles;

import java.util.ArrayList;

public class For {
    private ArrayList<String> tabs;

    public static boolean a(){
        return true;
    }

    public static boolean b(){
        return true;
    }

    public static void main(String[] args) {
        if (a()||b()) {
            System.out.println("HELLO");
        }
    }
}
