public class Auto {
    private String modello;
    private String marca;
    private double prezzo;

    public Auto (String marc, String mod, double prez){
        modello=mod;
        marca=marc;
        prezzo=prez;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String mod){
        modello=mod;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marc){
        marca=marc;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prez){
        prezzo=prez;
    }

    }
