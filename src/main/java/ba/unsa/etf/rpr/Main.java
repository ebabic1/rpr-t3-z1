package ba.unsa.etf.rpr;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Imenik imenik = new Imenik();
        try {
            imenik.dodaj("Aldar Babić", new FiksniBroj(Grad.SARAJEVO,"069-916"));
            imenik.dodaj("Bakir Babić", new FiksniBroj(Grad.SARAJEVO,"123-916"));
        } catch (EldozaIzuzetak ex) {
            System.out.println(ex.getMessage());
        };
        System.out.println(imenik.naSlovo('a'));
        Set<TelefonskiBroj> s = imenik.izGradaBrojevi(Grad.SARAJEVO);
        for(TelefonskiBroj element : s) {
            System.out.println(element.ispisi());

        }
    }
}