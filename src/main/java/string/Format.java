package string;

import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        String message = "Hello, world!";
        Locale locale = new Locale("es", "ES");
        String localizedMessage = String.format(locale, "¡%s!", message);
        System.out.println(localizedMessage); // Output (in Spanish locale): ¡Hola, mundo!

    }
}
