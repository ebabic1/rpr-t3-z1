package ba.unsa.etf.rpr;

public class EldozaIzuzetak extends Exception{
    public EldozaIzuzetak(){};
    public EldozaIzuzetak(String poruka) {
        super(poruka);
    }
    public String getMessage(){
        return super.getMessage();
    }
}
