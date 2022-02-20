package xpath;

public class Test {
    public static void main(String[] args) {
        String path = " К060 - Вид пов'язаної особи  ";

        //xpath=//td[text()=concat('my ',"'",'apos',"'",' and "quot" string')]
        //concat('//tr[@title=',"'",'Ознаку "Ненадійний клієнт"',"'",']')
        //concat('К060 - Вид пов',"'",'язаної особи ')
        System.out.println(escapeXPath(path));
    }
    public static String escapeXPath(String string) {
        if (string == null) {
            return null;
        } else if (string.contains("'")) {
            StringBuilder sb = new StringBuilder();
            sb.append("concat('");

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if ('\'' == ch) {
                    sb.append("',\"").append(ch).append("\",'");
                } else {
                    sb.append(ch);
                }
            }

            sb.append("')");
            return sb.toString();
        } else {
            return "'" + string + "'";
        }
    }

}
