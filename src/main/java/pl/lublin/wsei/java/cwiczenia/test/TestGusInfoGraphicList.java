package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.Infografika;

import java.io.IOException;

public class TestGusInfoGraphicList {
    public static void main(String[] args) throws IOException {
        GusInfoGraphicList list = new GusInfoGraphicList();
        for (Infografika ig: list.infografiki) {
            ig.print();
        }
    }
}
