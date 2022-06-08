package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.Infografika;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GusInfoGraphicList {
    public ArrayList<Infografika> infografiki = new ArrayList<>();

    public GusInfoGraphicList() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));

        String[] items = contents.split("<item>");
        for (int i = 1; i < items.length; i++){
            infografiki.add(new Infografika(items[i]));
        }

    }
}
