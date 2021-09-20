public class Kunden {
    //DEKLARATION
    String _vorname;
    String _nachname;
    String _adresse;
    String _telefon;
    String _mail;
    
    //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
    public Kunden (String vorname, String nachname) {
        this.setVorname(vorname);
        this.setNachname(nachname);
    }
    
    //GETTER
    public String getVorname(){
        return _vorname;
    }
    public String getNachname(){
        return _nachname;
    }
    public String getAdresse(){
        return _adresse;
    }
    public String getTelefon(){
        return _telefon;
    }
    public String getMail(){
        return _mail;
    }

    //SETTER
    public void setVorname(String vorname){
        _vorname = vorname;
    }
    public void setNachname(String nachname){
        _nachname = nachname;
    }
    public void setAdresse(String adresse){
        _adresse = adresse;
    }
    public void setTelefon(String telefon){
        _telefon = telefon;
    }
    public void setMail(String mail){
        _mail = mail;
    }
}
