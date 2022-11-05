package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {
    public abstract String ispisi();
    public abstract int hashCode();
    public int compareTo(TelefonskiBroj telefonskiBroj){
        return this.ispisi().compareTo(telefonskiBroj.ispisi());
    }
}
