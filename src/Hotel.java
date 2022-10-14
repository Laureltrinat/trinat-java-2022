import java.util.Scanner;
public class Hotel {

    String bezeichnung;
    int stockwerke;
    int zimmerpStock;
    int belegteZimmer ;
    int ubrigerPlatz;


   public int getFreiZimmer(){

       int FreieZimmer = (stockwerke*zimmerpStock)-belegteZimmer;

       System.out.println("Anzahl freie Zimmer : "+FreieZimmer);

       return FreieZimmer;
    }
    public void belegung(){
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wählen sie ein Hotel : Maria = 1 , Schneehaus = 2, Winterchalet = 3");
        int Wahl =  (eingabe.nextInt()-1);
    }
    public void printInfo(){

       System.out.println(bezeichnung);
       System.out.println("Anzahhl Stockwerke :"+ stockwerke);
       System.out.println("Anzahl Zimmer pro Stock : "+zimmerpStock);
       System.out.println("Anzahl belegte Zimmer : "+belegteZimmer);

    }


}
