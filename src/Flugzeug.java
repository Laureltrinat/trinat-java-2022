import java.util.Scanner;
public class Flugzeug {
    Scanner eingabe = new Scanner(System.in);
    String bezeichnung;
    int idNummer;
    int sitze;
    int Geschwindigkeit;
    int Reichweite;
    double Zeit;
    int JahresKapa;

    public double getTime( double Distanz){
        double resultat = 0;
        resultat = Distanz/Geschwindigkeit;
        return resultat;
    }
    public void printinfo() {
        System.out.print(bezeichnung +" : ");
        System.out.println(sitze +" Sitze");
        System.out.println("Geschwindigkeit : "+ Geschwindigkeit+ "  km/h");
        System.out.println("Reichweite : "+ Reichweite +" km");
        System.out.println("Flugdauer : "+Math.round(Zeit*10) / 10.0 + "h");
        System.out.println("Jahreskapazitaet : "+JahresKapa);
        System.out.println(" ");

    }

    public int Kapazitaet(int Tage){
        int AnzahlLeute = Tage * sitze ;
        return AnzahlLeute;
    }


}
