import java.util.Scanner;
public class Zad11{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double wartosc, stanowy, lokalny, podatek4, podatek2, cena;
        stanowy = 0.04;
        lokalny = 0.02;

        System.out.print("Podaj wartość porduktu ");
        wartosc = klawisz.nextInt();

        podatek4 = wartosc * stanowy;
        podatek2 = wartosc * lokalny;
        cena = wartosc + podatek4 + podatek2;

        System.out.print("\nWartość nieopodatkowana: " +wartosc);
        System.out.print("\nWartość podatku stanowego: " +podatek4);
        System.out.print("\nWartość podatku lokalnego: " +podatek2);
        System.out.print("\nLaczna cena sprzedaży: " +cena);

    }

}

