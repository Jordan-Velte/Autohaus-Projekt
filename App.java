//import
import java.util.Scanner;

public class App {
    
    /*
    //Klassenvariablen müssen innerhalb Klassenrumpfes sein, dürfen nicht in Methoden! Static, weil darf nur einmal deklariert werden, einmalig --> App Java darf nur einen Startpunkt haben, Compiler wüsste sonst nicht wo er anfangen sollte. 
    private static Scanner _scanner;
    //SETTER (durch STRG + set)
    public static void setScanner(Scanner _scanner) {
        App._scanner = _scanner;
    }
    //GETTER
    public static Scanner getScanner(){
        return _scanner;
    }
    //startMenu-Methode
    public static void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
    }
    */
    //Autos Liste
    public static void addAuto(Autos autos){
        _autos[0] = autos;
    }
    static Autos [] _autos;
    public static Autos[] getALLAutos(){
        return _autos;
    }

    //Kunden Liste
    static Kunden [] _kunden;
    public static void addKunde(Kunden kunden){
        _kunden[0] = kunden;
    }
    public static Kunden [] getALLKunden(){
        return _kunden;
    }

    //Verkauefer Liste
    static Verkaeufer[] _verkaeufer;
    public static void addVerkaeufer(Verkaeufer verkaeufer){
        _verkaeufer[0] = verkaeufer;
    }
    public static Verkaeufer[] getALLVerkaeufer(){
        return _verkaeufer;
    }

    //Main-Methode ist immer der Einsteigspunkt des Programms
    public static void main(String[] args) throws Exception {
        //Initialisierung _autos
        _autos = new Autos[8];
        _autos [0] = new Autos("BMW", "I3", "2020");
        _autos [1] = new Autos("Mercedes", "A220", "2019");
        _autos [2] = new Autos("VW", "Polo", "2005");
        
        //Initialisierung _kunden
        _kunden = new Kunden[8];
        _kunden [0] = new Kunden("Herbert", "Stiefel");
        _kunden [1] = new Kunden("Hans", "Mueller");

        //Initialisierung _verkaeufer
        _verkaeufer = new Verkaeufer[1];
        _verkaeufer [0] = new Verkaeufer("Jordan", "Velte");
        _verkaeufer [1] = new Verkaeufer("Thomas", "Mueller");


        
        //Neues Objekt der Klasse Menu
        Menu menu = new Menu();
        //Methode wird durch Punktnotation am Objekt aufgerufen
        menu.startMenu();
        //menu.createAutos();
        //Neues Objekt a1 der Klasse Menu
        /*Menu a1 = new Menu();*/
        //createAutos Methode wird an dem Objekt a1 aufgerufen
        /*a1.createAutos();*/
        
        /*
        //SETTER wird aufgerufen 
        //Systemeingabe des Obekts Scanner wird dem Setter übergeben 
        setScanner(new Scanner(System.in));
        //Menu-Methode wird aufgerufen
        startMenu();
        */
        /*
        //4 AUTOS
        // Erstellen der Objekte a1-a4 Autos aus der Klasse Autos. Am Constructor wird Wertübergabe sozusagen vorher für die Methode new Autos definiert. Somit nur noch Parameterübergabe nötig, keine zusätzliche Setter-Methode für Deklaration der Variablen --> Verweis über Constructor zur Settermethode über Variablen
        Autos a1 = new Autos("VW", "Polo", 2000);
        Autos a2 = new Autos("Mercedes-Benz", "A180", 2010);
        Autos a3 = new Autos("BMW", "i118", 2000);
        Autos a4 = new Autos("Porsche", "Carrera 911", 2006);
        
        //Deklaration der Variable Preis der Objekte a1-a4 durch Setter-Methode
        a1.setPreis(2000);
        a2.setPreis(5000);
        a3.setPreis(1500);
        a4.setPreis(40000);

        //4 KUNDEN
        //Erstellen der Objekte k1-k4 aus der Klasse Kunden, Erklärung oben
        Kunden k1 = new Kunden("Bernd", "Schmidt");
        Kunden k2 = new Kunden("Franz", "Lahm");
        Kunden k3 = new Kunden("Hugo", "Beckenbauer");
        Kunden k4 = new Kunden("Marcel", "Nuss");
        
        //Deklaration der Variable Adresse der Objekte k1-k4 durch Setter-Methode
        k1.setAdresse("Buschweg 3");
        k2.setAdresse("Rosengang 22");
        k3.setAdresse("Dorfweg 4");
        k4.setAdresse("Landstrasse 104");

        //Deklaration der Variable Telefon der Objekte k1-k4 durch Setter-Methode
        k1.setTelefon("01525923");
        k2.setTelefon("01235198");
        k3.setTelefon("09739382");
        k4.setTelefon("03212358");

        //Deklaration der Variable Mail der Objekte k1-k4 durch Setter-Methode
        k1.setMail("bernd.schmidt@gmx.de");
        k2.setMail("franz.lahm@gmail.com");
        k3.setMail("hugo.beckenbauert@gmx.de");
        k4.setMail("marcel.nuss@yahoo.com");

        //2 VERKAEUFER
        // Erstellen der Objekte v1-v4 aus der Klasse Verkaeufer, Erklärung oben
        Verkaeufer v1 = new Verkaeufer("Hermann", "Schmidt");
        Verkaeufer v2 = new Verkaeufer("Herbert", "Mueller");

        //Deklaration der Variable Personalnummer der Objekte v1-v2 durch Setter-Methode
        v1.setPersonalnummer(12);
        v2.setPersonalnummer(13);

        //4 VERKAEUFE
        // Erstellen der Objekte vk1-vk4 aus der Klasse Verkauf und Zuweisung der jeweiligen Variablen aus den obigen Setter-Methoden, Oben erstellte Objekte werden der Methode als Parameter übergeben
        Verkauf vk1 = new Verkauf(a1, v1, k1);
        vk1.setPreis(a1.getPreis());

        Verkauf vk2 = new Verkauf(a2, v1, k2);
        vk2.setPreis(a2.getPreis());

        Verkauf vk3 = new Verkauf(a3, v2, k3);
        vk3.setPreis(a3.getPreis());

        Verkauf vk4 = new Verkauf(a4, v2, k4);
        vk4.setPreis(a4.getPreis());

        
        //Verkauf 1, Ausgabe mittels Getter-Methoden (beziehen sich auf die obig erstellten Objekte der jeweiligen Klasse)
        System.out.println("Verkauf 1");
        System.out.println("Auto: " + vk1.getAuto().getMarke() + " " + vk1.getAuto().getModell());
        System.out.println("Kunde: " + vk1.getKunde().getVorname() + " " + vk1.getKunde().getNachname());
        System.out.println("Preis in EUR: " + vk1.getPreis());
        System.out.println("Verkaeufer: " + vk1.getVerkaeufer().getVorname() + " " + vk1.getVerkaeufer().getNachname());

        //Leerzeichen
        System.out.println("");

        //Verkauf 2
        System.out.println("Verkauf 2");
        System.out.println("Auto: " + vk2.getAuto().getMarke() + " " + vk2.getAuto().getModell());
        System.out.println("Kunde: " + vk2.getKunde().getVorname() + " " + vk2.getKunde().getNachname());
        System.out.println("Preis in EUR: " + vk2.getPreis());
        System.out.println("Verkaeufer: " + vk2.getVerkaeufer().getVorname() + " " + vk2.getVerkaeufer().getNachname());
        
        //Leerzeichen
        System.out.println("");

        //Verkauf 3
        System.out.println("Verkauf 3");
        System.out.println("Auto: " + vk3.getAuto().getMarke() + " " + vk3.getAuto().getModell());
        System.out.println("Kunde: " + vk3.getKunde().getVorname() + " " + vk3.getKunde().getNachname());
        System.out.println("Preis in EUR: " + vk3.getPreis());
        System.out.println("Verkaeufer: " + vk3.getVerkaeufer().getVorname() + " " + vk3.getVerkaeufer().getNachname());
        
        //Leerzeichen
        System.out.println("");

        //Verkauf 4
        System.out.println("Verkauf 4");
        System.out.println("Auto: " + vk4.getAuto().getMarke() + " " + vk4.getAuto().getModell());
        System.out.println("Kunde: " + vk4.getKunde().getVorname() + " " + vk4.getKunde().getNachname());
        System.out.println("Preis in EUR: " + vk4.getPreis());
        System.out.println("Verkaeufer: " + vk4.getVerkaeufer().getVorname() + " " + vk4.getVerkaeufer().getNachname());
*/

    }
}
