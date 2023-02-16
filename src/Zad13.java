import java.util.Scanner;
public class Zad13{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double ciastka, kal, iloscnaP, calnaciast;
        double Kalporc = 300;
        double pudelko = 40;
        double porcja = 10;
        iloscnaP = pudelko/porcja;
        calnaciast = Kalporc/iloscnaP;

        System.out.print("Podaj ilość spożytych ciastek: ");
        ciastka = klawisz.nextInt();


        kal = ciastka*calnaciast ;

        System.out.print("\nWartośc spożytych kalorii: " +kal);



    }

}
