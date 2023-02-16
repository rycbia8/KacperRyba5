import java.util.Scanner;
public class Zad17{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        double podatek = 0.0675;
        double napiwek = 0.2;


        System.out.print("Wprowadz cenę posiłku: ");
        double cena = klawisz.nextInt();

        double wartoscPod, wartoscNap, laczna;
        wartoscPod = cena * podatek;
        wartoscNap = cena * napiwek;
        laczna = cena + wartoscPod + wartoscNap;

        System.out.print("\n\nCena posiłku: " +cena);
        System.out.print("\nWartość podatku: " +wartoscPod);
        System.out.print("\nWartość napiwku: " +wartoscNap);
        System.out.print("\nCena łączna: " +laczna);


    }

}

