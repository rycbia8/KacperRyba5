import java.util.Scanner;
public class Zad15{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);
        double zysk;
        double marza = 0.4;

        System.out.print("Podaj Cenę detaliczną płytki: ");
        double cena = klawisz.nextInt();


        zysk = cena*marza;


        System.out.print("\nZysk ze sprzedaży produktu wynosi: " +zysk);



    }

}
