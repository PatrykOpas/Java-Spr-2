package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestInfografika {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml"))).split("<item>")[1];

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(contents);

        Infografika infografika = new Infografika(contents);
        infografika.print();

    }
}
