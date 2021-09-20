public class Verkaeufer {
    //DEKLARATION
    String _vorname;
    String _nachname;
    int _personalnummer;

    //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
    public Verkaeufer (String vorname, String nachname){
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
    public int getPersonalnummer(){
        return _personalnummer;
    }

    //SETTER
    public void setVorname(String vorname){
        _vorname = vorname;
    }
    public void setNachname(String nachname){
        _nachname = nachname;
    }
    public void setPersonalnummer(int personalnummer){
        _personalnummer = personalnummer;
    }
}
