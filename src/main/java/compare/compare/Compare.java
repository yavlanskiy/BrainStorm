package compare.compare;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Compare {
    public static void main(String[] args) throws IOException {
        File etalonFile = Paths.get("/Users/max/IdeaProjects/BrainStorm/src/main/java/compare/compare/etalon/2602.TXT").toFile();
        File currentFile = Paths.get("/Users/max/IdeaProjects/BrainStorm/src/main/java/compare/compare/current/2602.TXT").toFile();

        boolean equal = FileUtils.contentEqualsIgnoreEOL(etalonFile, currentFile, null);
        System.out.println(equal);
    }
}
