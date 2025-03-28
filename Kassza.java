public class Kassza {
    private String kasszasNev;
    private int kasszasKod;
    private int valto;
    private int penz;
    private final int kasszaSzam;
    
    public Kassza(int kasszaSzam) {
        this.kasszaSzam = kasszaSzam;
    }
    public String getKasszasNev() {
        if(kasszasNev == null) {
            return "Nincs beléptetve senki";
        }
        return kasszasNev;
    }
    public int getKasszasKod() {
        if(kasszasKod == 0) {
            return 0;
        }
        return kasszasKod;
    }
    public int getValto() {
        if(kasszasKod == 0) {
            return 0;
        }
        return valto;
    }
    public int getPenz() {
        if(kasszasKod == 0) {
            return 0;
        }
        return penz;
    }
    public int getKasszaSzam() {
        return kasszaSzam;
    }
    public boolean beleptet(String kasszasNev, int kasszasKod, int valto) {
        if(this.kasszasKod == 0) {
            this.kasszasNev = kasszasNev;
            this.kasszasKod = kasszasKod;
            this.valto = valto;
            this.penz = valto;
            return true;
        }
        return false;
    }
}
