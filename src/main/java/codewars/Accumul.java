package codewars;

public class Accumul {
    public static String accum(String s) {
        StringBuilder resultString = new StringBuilder();
        int count = 0;
        char[] mass = s.toCharArray();
        for (char string : mass) {
            count ++;
            if (count == 1) {
                resultString.append(Character.toUpperCase(string));
            } else {
                int j = 0;
                while (j != count) {
                    if (j == 0) {
                        resultString.append(Character.toUpperCase(string));
                    } else {
                        resultString.append(Character.toLowerCase(string));
                    }
                    j++;
                }
            }
            resultString.append("-");
        }
        return resultString.toString().replaceAll(".$", "");
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}
