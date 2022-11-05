package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {
    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        try {
            imenik.dodaj("Huso Husić", new FiksniBroj(Grad.SARAJEVO,"123-456"));
        } catch (EldozaIzuzetak e) {
            throw new RuntimeException(e);
        }
        assertEquals(imenik.map.get("Huso Husić").ispisi(),"033/123-456");
    }

    @Test
    void naSlovo() {
        Imenik imenik = new Imenik();
        try {
            imenik.dodaj("Aldar Babić", new FiksniBroj(Grad.SARAJEVO,"069-916"));
            imenik.dodaj("Bakir Babić", new FiksniBroj(Grad.SARAJEVO,"123-916"));
        } catch (EldozaIzuzetak ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(imenik.naSlovo('a'),"1. Aldar Babić - 033/069-916");
    }

    @Test
    void izGradaBrojevi() {
        Imenik imenik = new Imenik();
        try {
            imenik.dodaj("Aldar Babić", new FiksniBroj(Grad.SARAJEVO,"069-916"));
            imenik.dodaj("Bakir Babić", new FiksniBroj(Grad.SARAJEVO,"123-916"));
        } catch (EldozaIzuzetak ex) {
            System.out.println(ex.getMessage());
        }
        Set<TelefonskiBroj> s = imenik.izGradaBrojevi(Grad.SARAJEVO);
        Set<TelefonskiBroj> s1 = new TreeSet<>();
        try {
            s1.add(new FiksniBroj(Grad.SARAJEVO,"069-916"));
            s1.add(new FiksniBroj(Grad.SARAJEVO,"123-916"));
        } catch (EldozaIzuzetak ex) {
            System.out.println(ex.getMessage());
        };
        assertTrue(s.equals(s1));
    }
    @Test
    void testIzuzetak() {
        assertThrows(EldozaIzuzetak.class, () -> new FiksniBroj(Grad.SARAJEVO,"916" ));
    }

}