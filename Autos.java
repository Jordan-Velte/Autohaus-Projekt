public class Autos {
    //DEKLARATION
    String _marke;
    int _preis;
    String _modell;
    String _baujahr;

    //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
    public Autos (String marke, String modell, String baujahr) {
        this.setMarke(marke);
        this.setModell(modell);
        this.setBaujahr(baujahr);
    }

    //GETTER
    public String getMarke(){
        return _marke;
    }
    public int getPreis(){
        return _preis;
    }
    public String getModell(){
        return _modell;
    }
    public String getBaujahr(){
        return _baujahr;
    }

    //SETTER
    public void setMarke(String marke){
        _marke = marke;
    }    
    public void setPreis(int preis){
        _preis = preis;
    }    
    public void setModell(String modell){
        _modell = modell;
    }    
    public void setBaujahr(String baujahr){
        _baujahr = baujahr;
    }    
}
