package pl.lublin.wsei.java.cwiczenia.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFileRead {
    public static void main(String[] args) throws java.io.IOException {
        String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(contents);

        if (m.find())
            System.out.println("Znaleziono tytuł: "+m.group(1));
        else
            System.out.println("Nie znaleziono tytułu");

    }
}
