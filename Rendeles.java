
import java.util.HashMap;


public class Rendeles {
    private final int rendelesSzam;
    private int osszeg;
    private final HashMap<Integer, Integer> rendeltArukMennyisegei = new HashMap<>();
    
    public Rendeles(int rendelesSzam) {
        this.rendelesSzam = rendelesSzam;
    }

    public int getRendelesSzam() {
        return rendelesSzam;
    }
    public int getOsszeg() {
        return osszeg;
    }
    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }
    public void addRendeltArucikk(int arucikkSzam, int mennyiseg) {
        rendeltArukMennyisegei.put(arucikkSzam, mennyiseg);
    }
    @Override
    public String toString() {
        String s = "Rendelés száma: " + rendelesSzam + "\n";
        s += "Rendelt áruk mennyiségei:\n";
        for (int arucikkSzam : rendeltArukMennyisegei.keySet()) {
            s += "  " + arucikkSzam + ": " + rendeltArukMennyisegei.get(arucikkSzam) + " db\n";
        }
        s += "Összeg: " + osszeg + " Ft\n";
        return s;
    }


}
