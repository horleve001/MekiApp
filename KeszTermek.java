import java.util.ArrayList;
import java.util.List;


public class KeszTermek {
    private final String nev;
    private int ar;
    private final int kod;
    private final List <Integer> tartalom;

    public KeszTermek(String nev, int ar, int kod) {
        this.nev = nev;
        this.ar = ar;
        this.kod = kod;
        this.tartalom = new ArrayList<>();
    }
    public String getNev() {
        return nev;
    }
    public int getAr() {
        return ar;
    }
    public int getKod() {
        return kod;
    }
    public List <Integer> getTartalom() {
        return tartalom;
    }
    public void setAr(int ar) {
        if(ar > 0) {
            this.ar = ar;
        }
        else{
            System.out.println("Az ár nem lehet negatív!");
        }
        
    }
    public boolean addTartalom(int aruKod) {
        for(int i : tartalom) {
            if(i == aruKod) {
                return false;
            }
        }
        tartalom.add(aruKod);

        return true;
    }
}
