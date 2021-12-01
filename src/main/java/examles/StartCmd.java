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
        //valuesMap.put("4", "4");


        // 1. Установку константы (если есть)

        // 2.
        String templateString = "java -jar nbuxml-1.0.jar -a ${1} -s creator -u creator -p c67 -rd ${2} -loglevel INFO -ft ${3} -outpath ${4}";
        //String templateString = "The ${animal} jumped over the ${target}.";

        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(templateString);
        System.out.println(resolvedString);
    }



}


//[09:35] Igor Maschikevich
//        Привіт.
//        java -jar D:\SVN\Automation\Development\GIT\xml_scripts\build\release\nbuxml.jar -a mizar_Z3 -s CREATOR -u CREATOR -p c67 -rd 01.10.2036 -loglevel INFO -ft FI5X -outpath D:\SVN\Automation\Development\GIT\xml_scripts\build\CurrentFiles\3.48.0.0
//
//        [09:35] Igor Maschikevich
//        Приклад строки зроблений на базі теста 10437
//        -rd 01.10.2036 це параметер теста
//        -ft FI5X це параметер теста
//        -outpath D:\\CurrentFiles шлях куди буде згенерований xml файл
//        java -jar D:\\nbuxml.jar старт для nbuxml.jar
//        -s mizar_z3 база на якій буде запускатися nbuxml.jar
//        -loglevel INFO це лог nbuxml.jar, від нього мож на віказатися

