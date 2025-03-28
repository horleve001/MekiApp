public class NyersAru {
    private final String nev;
    private int ar;
    private final int kod;
    private final int kiszereles;
    private final double csomagTartalom;
    private final String mertekegyseg;
    private double mennyiseg = 0;
    private double vartMennyiseg = 0;
    private int szallitasok = 0;


    public NyersAru(String nev, int ar, int kod, int kiszereles, double csomagTartalom, String mertekegyseg) {
        this.nev = nev;
        this.ar = ar;
        this.kod = kod;
        this.kiszereles = kiszereles;
        this.csomagTartalom = csomagTartalom;
        this.mertekegyseg = mertekegyseg;
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
    public int getKiszereles() {
        return kiszereles;
    }
    public double getCsomagTartalom() {
        return csomagTartalom;
    }
    public String getMertekegyseg() {
        return mertekegyseg;
    }
    public double getMennyiseg() {
        return mennyiseg;
    }
    public double getVartMennyiseg() {
        return vartMennyiseg;
    }
    public int getSzallitasok() {
        return szallitasok;
    }
    public void setAr(int ar) {
        this.ar = ar;
    }
    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public void setVartMennyiseg(double vartMennyiseg) {
        this.vartMennyiseg = vartMennyiseg;
    }
    public void szallit(double mennyiseg) {
        this.vartMennyiseg += mennyiseg;
        this.mennyiseg += mennyiseg;
        this.szallitasok += mennyiseg;
    }

}
