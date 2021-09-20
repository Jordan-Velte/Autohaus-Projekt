//import, dadurch können wir den Datentyp Scanner nutzen --> kein elementarer Datentyp
import java.util.Scanner;

//Eigene Klassse, Prämisse 1) static loswerden, 2) Ändern leichter
public class Menu {
    //DEKLARATION Scanner
    Scanner _scanner;
    //DEKLARATION VARIABLEN FÜR AUTO - Unklar ob nötig
    Scanner _marke;
    Scanner _preis;
    Scanner _modell;
    Scanner _baujahr;
    
    //CONSTRUCTOR: Man brauch nur einen Scanner (siehe Arbeitsblatt vom 10.9.2021)
    public Menu(){
        this.setScanner(new Scanner(System.in));
    }

    
    //SETTER für Scanner
    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    //GETTER für Scanner
    public Scanner getScanner() {
        return _scanner;
    }
    //Menu-Methode
    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        //IF-Bedingung nach TRUE und FALSE (siehe Foto)
        if(choice.equals("1")){
            System.out.println("Verkauf noch nicht implementiert.");
        }
        //immer bei Bedingungen: WERT OPERATOR VERGLEICHSWERT
        else if(choice.equals("2")){
            createKundeMenu();
        }
        else if(choice.equals("3")){
            createAutoMenu();
        }
        else if(choice.equals("4")){
            createVerkaeuferMenu();
        }
        else{
            System.out.println("Bitte nur 1,2,3,4 eingeben!");
        }
        startMenu();
    }

    /*
    //CONSTRUCTOR für Autos
    public Autos() {
        this.setMarke(new Scanner(System.in));
        this.setPreis(new Scanner(System.in));
        this.setModell(new Scanner(System.in));
        this.setBaujahr(new Scanner(System.in));
    }*/
    //Man brauch keine SETTER Und GETTER im Menu
    /*
    //GETTER für Autos
    public Scanner getMarke(){
        return _marke;
    }
    public Scanner getPreis(){
        return _preis;
    }
    public Scanner getModell(){
        return _modell;
    }
    public Scanner getBaujahr(){
        return _baujahr;
    }

    //SETTER für Autos
    public void setMarke(Scanner marke){
        _marke = marke;
    }    
    public void setPreis(Scanner preis){
        _preis = preis;
    }    
    public void setModell(Scanner modell){
        _modell = modell;
    }    
    public void setBaujahr(Scanner baujahr){
        _baujahr = baujahr;
    } 
    */
    public void showAutos(){
        for (Autos autos : App.getALLAutos()){
            if(autos != null){
                System.out.println(autos.getMarke() + " " + autos.getBaujahr());
            }
        }
    }
    //createAutos-Methode, Work in Progress --> deshalb Kommentar tbd
    public void createAutoMenu(){
        //System.out.print --> Cursor ist genau am Ende des Strings für die Eingabe im Terminal
        System.out.println("Auto erstellen.");
        System.out.print("Geben Sie die Marke ein:");
        String choicemarke = getScanner().nextLine();
        System.out.print("Geben Sie das Modell ein:");
        String choicemodell = getScanner().nextLine();
        System.out.print("Geben Sie das Baujahr ein:");
        String choicebaujahr = getScanner().nextLine();
        /*System.out.print("Geben Sie den Preis ein:");
        String choicepreis = getScanner().nextLine();
        System.out.print("Geben Sie das Baujahr ein:");
        String choicebaujahr = getScanner().nextLine();*/
        System.out.println("Es wurde ein neues Auto eingetragen.");
        //Variablen zu einem Auto zusammensetzen, Objekt wird erzeugt, welches direkt in einen Array gesetzt wird.
        App.addAuto(new Autos(choicemarke, choicemodell, choicebaujahr));
        System.out.println(App.getALLAutos());
        //System.out.println("Marke: " + choicemarke);
        //System.out.println("Preis: " + choicepreis);
        //System.out.println("Modell: " + choicemodell);
        //System.out.println("Baujahr: " + choicebaujahr);
        //Objekt Auto a1 wird erstellt (siehe Constructor der Klasse Autos)
        //Autos a1 = new Autos(choicemarke, choicemodell);
        //startMenu();
    }
    //Kunden-Menu-Methode
    public void createKundeMenu(){
        System.out.println("Vorname:");
        String choicevorname = getScanner().nextLine();
        System.out.println("Nachname");
        String choicenachname = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Kunde eingetragen.");
        App.addKunde(new Kunden(choicevorname, choicenachname));
        System.out.println(App.getALLKunden());
        /* System.out.println("Vorname: " + choicevorname);
        System.out.println("Nachname: " + choicenachname);
        Kunden k1 = new Kunden(choicevorname, choicenachname);
        System.out.println(); */
    }
    //Verkaeufer-Menu-Methode
    public void createVerkaeuferMenu(){
        System.out.println("Vorname:");
        String choicevorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String choicenachname = getScanner().nextLine();
        System.out.println("Personalnummer: ");
        String choicepersonalnummer = getScanner().nextLine();
        Integer persnr = Integer.valueOf(choicepersonalnummer);
        System.out.println("Es wurde ein neuer Kunde eingetragen.");
        App.addVerkaeufer(new Verkaeufer(choicevorname, choicenachname));
        System.out.println(App.getALLKunden());
        /*System.out.println("Vorname: " + choicevorname);
        System.out.println("Vorname: " + choicenachname);
        Verkaeufer v1 = new Verkaeufer(choicevorname, choicenachname); */
    }
    //Verkauf-Menu-Methode TBD


    /*
    public Auto(){
        this.setMarke(new Scanner(System.in));
        this.setPreis(new Scanner(System.in));
        this.setModell(new Scanner(System.in));
        this.setBaujahr(new Scanner(System.in));
    }

    public void Auto(){
        String marke = getMarke().nextLine();
        int preis = getPreis().nextLine();
        String modell = getModell().nextLine();
        int baujahr = getBaujahr().nextLine();

        System.out.println("Die Marke ist: ");

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
    public int getBaujahr(){
        return _baujahr;
    }

    //SETTER
    public void setMarke(String _marke) {
        this._marke = _marke;
    }
    public void setBaujahr(int _baujahr) {
        this._baujahr = _baujahr;
    }
    public void setModell(String _modell) {
        this._modell = _modell;
    }
    public void setPreis(int _preis) {
        this._preis = _preis;
    } */
    
}

