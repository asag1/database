package medziai;

public class Lapuociai implements Medziai {
    private String rusis;
    private int metai;
    private double aukstis;
    private String spalva;
    private String lapuTipas;

    public Lapuociai(String rusis, int metai, double aukstis, String spalva, String lapuTipas) {
        this.rusis = rusis;
        this.metai = metai;
        this.aukstis = aukstis;
        this.spalva = spalva;
        this.lapuTipas = lapuTipas;
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

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public String getLapuTipas() {
        return lapuTipas;
    }

    public void setLapuTipas(String lapuTipas) {
        this.lapuTipas = lapuTipas;
    }

    @Override
    public String turi() {
        return "turi lapus";
    }

    @Override
    public String kirsti() {
        if (metai>30){
            return "galima kirsti";
        }
        return "kirsti negalima";
    }

    @Override
    public String toString() {
        return rusis + " auga jau " + metai + " yra " + aukstis + " aukšsio " +
                " yra " + spalva  +" "+  turi() + lapuTipas;
    }
}
