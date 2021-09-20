public class Verkauf {
    //DEKLARATION der Klassenvariablen
    Autos _auto;
    Kunden _kunde;
    int _preis;
    Verkaeufer _verkaeufer;

    //KONSTRUKTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen --> Besonderheit: Parameter des Verkauf-Constructors haben Verweis zu Variablen unterschiedlicher Klassen. Wird dieser Verweis gelöscht, so ist das Objekt nicht mehr relevant
    public Verkauf (Autos autos, Verkaeufer verkaeufer, Kunden kunden){
        this.setAuto(autos);
        this.setVerkaeufer(verkaeufer);
        this.setKunde(kunden);
    }
    
    //GETTER (STRG + Leerzeichen = ...get eingeben)
    //Methodensignatur
    public Autos getAuto() {
        return _auto;
    }
    public Kunden getKunde() {
        return _kunde;
    }
    public int getPreis() {
        return _preis;
    }
    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }

    //SETTER
    public void setAuto(Autos _auto) {
        this._auto = _auto;
    }
    public void setKunde(Kunden _kunde) {
        this._kunde = _kunde;
    }
    public void setPreis(int _preis) {
        this._preis = _preis;
    }
    public void setVerkaeufer(Verkaeufer _verkaeufer) {
        this._verkaeufer = _verkaeufer;
    }
}