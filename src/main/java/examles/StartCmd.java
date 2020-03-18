package examles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;

public class StartCmd {

    public static void main(String[] args) throws ParseException, IOException {
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd D:\\SVN\\Automation\\Development\\FAT\\src\\Bats\\ && recreate_pdb.cmd qa_440_7");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}
