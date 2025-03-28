import java.util.ArrayList;
import java.util.List;

public class Keszlet {
    private final List <NyersAru> keszlet;

    public Keszlet() {
        keszlet = new ArrayList<>();
    }
    public boolean add(String nev, int ar, int kod, int kiszereles, double csomagTartalom, String mertekegyseg) {
        for(NyersAru n : keszlet) {
            if(n.getKod() == kod) {
                return false;
            }
        }
        keszlet.add(new NyersAru(nev, ar, kod, kiszereles, csomagTartalom, mertekegyseg));
        return true;
        
    }
    public boolean remove(int kod) {
        for(NyersAru n : keszlet) {
            if(n.getKod() == kod) {
                keszlet.remove(n);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        
        for(NyersAru n : keszlet) {
            System.out.println(n.getNev() + " (" + n.getKod() + "): " + n.getMennyiseg() + " " + n.getKiszereles() + " " + n.getCsomagTartalom() + " " + n.getMertekegyseg());
        }
        return "";
    }
}
