package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{
    String broj;
    Grad grad;
    public FiksniBroj(Grad grad, String broj) throws EldozaIzuzetak {
        {
            if (broj.length() == 7)
            {
                this.broj = broj;
                this.grad = grad;
            } else throw new EldozaIzuzetak("Ilegalan broj");
        }
    }
    @Override
    public String ispisi() {
        return grad.getPozivniBroj() + "/" + broj;
    }

    public int hashCode() {
        return broj.hashCode()+ grad.hashCode();
    }
}
