public class Autohaus {
    //Deklaration der Variablen
    String _name;
    String _adresse;
    String _telefon;

    //GETTER
    public String getName(){
        return _name;
    }
    public String getAdresse(){
        return _adresse;
    }
    public String getTelefon(){
        return _telefon;
    }

    //SETTER
    public void setName(String name){
        _name = name;
    }   
    public void setAdresse(String adresse){
        _adresse = adresse;
    }  
    public void setTelefon(String telefon){
        _telefon = telefon;
    }   
}
