import java.util.Scanner;
public class Zad20{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        double Cukier = 1.5;
        double Maslo = 1;
        double Maka = 2.75;
        double iloscprzepis = 48;
        double cukier1 = Cukier/iloscprzepis;
        double Maslo1 = Maslo/iloscprzepis;
        double Maka1 = Maka/iloscprzepis;

        System.out.print("Wprowadz ilośc ciastek: ");
        double ciastka = klawisz.nextInt();

        double IloscCukier, IloscMaslo, IloscMaka;
        IloscCukier = cukier1 * ciastka;
        IloscMaslo = Maslo1 * ciastka;
        IloscMaka = Maka1 * ciastka;

        System.out.printf("\n Ilośc szklanek cukru: %.1f", IloscCukier);
        System.out.printf("\n Ilośc szklanek masla %.1f", IloscMaslo);
        System.out.printf("\n Ilośc szklanek Mąki: %.1f", IloscMaka);

    }

}
