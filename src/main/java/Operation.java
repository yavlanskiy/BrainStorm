import java.util.Map;

public class Operation {
    public static void main(String[] args) {
        Map <String, String> map = System.getenv();
        for (Map.Entry <String, String> entry: map.entrySet()) {
            System.out.println("Variable Name:- " + entry.getKey() + " Value:- " + entry.getValue());
        }
    }
}
