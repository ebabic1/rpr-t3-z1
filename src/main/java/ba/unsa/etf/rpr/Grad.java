package ba.unsa.etf.rpr;

public enum Grad{
    SARAJEVO("033"),
    ZENICA("032"),
    BANJA_LUKA("051"),
    MOSTAR("036");
    private final String pozivniBroj;
    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }
    public String getPozivniBroj() {
        return this.pozivniBroj;
    }
}
