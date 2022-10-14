
    public class Reftyp {
        int x, y;
        static String bla;
        static void ausgabe(Reftyp ref) {
            ref.x = 25; ref.y = 25;
            bla= "TomTom";
            System.out.println("Methode ausgabe: x = " + ref.x + " y = " + ref.y);
        }
        public static void main(String[] args) {
            Reftyp ref = new Reftyp();
            ref.x = 15; ref.y = 15;
            bla = "Tom";
            ausgabe(ref);
            System.out.print("Methode main: x = " + ref.x + " y = " + ref.y+"\n"+"Methode main: x = " + ref.x + " y = " + ref.y);

        }
    }

