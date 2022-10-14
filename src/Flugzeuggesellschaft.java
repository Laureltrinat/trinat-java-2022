import java.util.Scanner;

public class Flugzeuggesellschaft {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        Flugzeug[] airline = new Flugzeug[5];

        for (int i = 0; i < 5 ; i++) {
            airline[i] = new Flugzeug();

        }


        airline[0].bezeichnung = "Airbus a320";
        airline[0].idNummer = 1;
        airline[0].sitze = 165;
        airline[0].Geschwindigkeit = 890;
        airline[0].Reichweite = 12600;


        airline[1].bezeichnung = "Boeing 747";
        airline[1].idNummer = 2;
        airline[1].sitze = 436;
        airline[1].Geschwindigkeit = 907;
        airline[1].Reichweite  = 13700;

        airline[2].bezeichnung = "AvroRJ 85";
        airline[2].idNummer = 3;
        airline[2].sitze = 93;
        airline[2].Geschwindigkeit = 760;
        airline[2].Reichweite = 2200;

        airline[3].bezeichnung = "Airbus a380";
        airline[3].idNummer = 4;
        airline[3].sitze = 516;
        airline[3].Geschwindigkeit = 907;
        airline[3].Reichweite = 12000;

        airline[4].bezeichnung ="Airbus a380-B";
        airline[4].idNummer = 5;
        airline[4].sitze = 409;
        airline[4].Geschwindigkeit = airline[3].Geschwindigkeit;
        airline[4].Reichweite = airline[3].Reichweite;

        for (int i = 0; i < 5; i++){
            airline[i].Zeit = airline[i].getTime(10000);
            airline[i].JahresKapa = airline[i].Kapazitaet(365);
        }
        airline[0].printinfo();
        airline[1].printinfo();
        airline[2].printinfo();
        airline[3].printinfo();
        airline[4].printinfo();

    }

}
