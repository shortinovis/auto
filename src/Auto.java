public class Auto {
    private String modello;
    private String marca;
    private double prezzo;

    public Auto (){
        modello=null;
        marca=null;
        prezzo=0.0;
    }
    public Auto (String marc, String mod, double prez){
        modello=mod;
        marca=marc;
        prezzo=prez;
    }
    public Auto (String marc){
        marca=marc;
        modello=null;
        prezzo=0.0;
    }
    public Auto (String marc, String mod){
        modello=mod;
        marca=marc;
        prezzo=0.0;
    }
    public Auto (String marc, double prez){
        modello=null;
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
