import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Rendeles {
    private final int rendelesSzam;
    private int osszeg;
    private final HashMap<Integer, Integer> rendeltAruk = new HashMap<>();
    
    public Rendeles() {
        Random random = new Random();
        this.rendelesSzam = random.nextInt(1000) + 1;
    }

    public int getRendelesSzam() {
        return rendelesSzam;
    }
    public int getOsszeg() {
        return osszeg;
    }
    public void setOsszeg(int osszeg) {
        this.osszeg += osszeg;
    }
    public void addRendeltArucikk(int arucikkSzam, int mennyiseg, List <KeszTermek> keszTermek) {
        if (rendeltAruk.containsKey(arucikkSzam)) {
            mennyiseg += rendeltAruk.get(arucikkSzam);
            rendeltAruk.remove(arucikkSzam);
        }
        if(mennyiseg <= 0) {
            rendeltAruk.remove(arucikkSzam);
            return;
        }
        int temp = getArucikkAr(arucikkSzam, keszTermek);
        if(temp == 0) {
            System.out.println("Nincs ilyen árucikk!");
            return;
        }
        rendeltAruk.put(arucikkSzam, mennyiseg);
        setOsszeg(mennyiseg * temp);
    }
    
    public String toString(List <KeszTermek> keszTermek) {
        String[] termekNevek = new String[rendeltAruk.size()];
        int j = 0;
        ArrayList<Integer> arucikkSzamok = new ArrayList<>(rendeltAruk.keySet());
        keszTermek.sort(comparingInt(KeszTermek::getKod));
        arucikkSzamok.sort(comparingInt(Integer::intValue));
        for (KeszTermek keszTermek1 : keszTermek) {
            if (keszTermek1.getKod() == arucikkSzamok.get(j)) {
                termekNevek[j] = keszTermek1.getNev();
                j++;
            }
        }
        j = 0; 
        String s = "Rendelés száma: " + rendelesSzam + "\n";
        s += "Rendelt áruk:\n";
        for (int arucikkSzam : rendeltAruk.keySet()) {
            s += "  " + termekNevek[j] + ": " + rendeltAruk.get(arucikkSzam) + " db\n";
            j++;
        }
        s += "Összeg: " + osszeg + " Ft\n";
        return s;
    }
    private int getArucikkAr(int arucikkSzam, List <KeszTermek> keszTermek) {
        for (KeszTermek keszTermek1 : keszTermek) {
            if (keszTermek1.getKod() == arucikkSzam) {
                return keszTermek1.getAr();
            }
        }
        return 0;
    }
}
