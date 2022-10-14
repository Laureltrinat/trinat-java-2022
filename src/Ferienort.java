import java.util.Scanner;

public class Ferienort {
    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);
        Hotel[] Hotelline = new Hotel[3];

        for (int i = 0; i < 3; i++){
            Hotelline[i] = new Hotel();
        }

        Hotelline[0].bezeichnung = "Maria";
        Hotelline[0].stockwerke = 10;
        Hotelline[0].zimmerpStock = 10;
        Hotelline[0].belegteZimmer = 40 ;

        Hotelline[1].bezeichnung = "Schneehaus";
        Hotelline[1].stockwerke = 5;
        Hotelline[1].zimmerpStock = 6;
        Hotelline[1].belegteZimmer = 20;

        Hotelline[2].bezeichnung = "Winterchalet";
        Hotelline[2].stockwerke = 7;
        Hotelline[2].zimmerpStock = 8;
        Hotelline[2].belegteZimmer = 35;


    }
}
