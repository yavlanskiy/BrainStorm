package examles;

import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartCmd{
    public static void main(String[] args) {
        Map<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("1", "1");
        valuesMap.put("2", "2");
        valuesMap.put("3", "3");
        valuesMap.put("4", "4");


        String templateString = "java -jar nbuxml-1.0.jar -a ${1} -s creator -u creator -p c67 -rd ${2} -loglevel INFO -ft ${3} -outpath ${4}";
        //String templateString = "The ${animal} jumped over the ${target}.";
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(templateString);
        System.out.println(resolvedString);
    }
}
