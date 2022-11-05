package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    HashMap<String, TelefonskiBroj> map;
    public Imenik(){
        this.map = new HashMap<String,TelefonskiBroj>();
    }
    public  void dodaj(String ime, TelefonskiBroj broj){
        map.put(ime,broj);
    }
    public String dajBroj(String ime) {
        return map.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        return map.get(broj).ispisi();
    }
    public String naSlovo(char s){
        int i = 1;
        String str = "";
        for(Map.Entry<String,TelefonskiBroj> element: map.entrySet()) {
            if (Character.toLowerCase(element.getKey().charAt(0))== s) str = str + i + ". " + element.getKey() + " - " + element.getValue().ispisi();
            i = i + 1;
        }
        return str;
    }
    public Set<String> izGrada(Grad g){
        Set<String> setStringova = new TreeSet<String>();
        for (Map.Entry<String,TelefonskiBroj> element : map.entrySet()) {
            if(element.getValue() instanceof FiksniBroj) setStringova.add(element.getKey());
        }
        return setStringova;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
       Set<TelefonskiBroj> setBrojeva = new TreeSet<TelefonskiBroj>();
       for(Map.Entry<String,TelefonskiBroj> element : map.entrySet()) {
           if(element.getValue() instanceof FiksniBroj && ((FiksniBroj) element.getValue()).grad.equals(g))
                        setBrojeva.add(element.getValue());
       }
       return setBrojeva;
    }
}
