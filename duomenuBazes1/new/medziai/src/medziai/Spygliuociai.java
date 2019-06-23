package medziai;

public class Spygliuociai implements Medziai {
    private String rusis;
    private int metai;
    private double aukstis;
    private String spygliuTipas;

    public Spygliuociai(String rusis, int metai, double aukstis, String spygliuTipas) {
        this.rusis = rusis;
        this.metai = metai;
        this.aukstis = aukstis;
        this.spygliuTipas = spygliuTipas;
    }

    public String getRusis() {
        return rusis;
    }

    public void setRusis(String rusis) {
        this.rusis = rusis;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public double getAukstis() {
        return aukstis;
    }

    public void setAukstis(double aukstis) {
        this.aukstis = aukstis;
    }

    public String getSpygliuTipas() {
        return spygliuTipas;
    }

    public void setSpygliuTipas(String spygliuTipas) {
        this.spygliuTipas = spygliuTipas;
    }

    @Override
    public String turi() {
        return "turi spyglius";
    }

    @Override
    public String kirsti() {
        if (metai>20){
            return "galima kirsti";
        }
        return "kirsti negalima";
    }

    @Override
    public String toString() {
        return rusis + " yra aukščio " + aukstis +
                " auga jau " + metai +" "+ turi() + spygliuTipas;
    }
}
