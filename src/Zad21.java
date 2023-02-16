import java.util.Scanner;
public class Zad21{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);




        System.out.print("Wprowadz kwotę pierwotną: ");
        double KwotaPierwo = klawisz.nextDouble();
        System.out.print("Podaj Stopę Oproc ");
        double StopaOproc = klawisz.nextDouble()/100;
        System.out.print("Ile razy w roku odsetki");
        double IleOdset = klawisz.nextDouble();
        System.out.print("Przez ile lat");
        double LatLiczba = klawisz.nextDouble();

        double KwotaPo = KwotaPierwo*(1+StopaOproc/IleOdset);


        System.out.print("\n\nKwota po latach: " +KwotaPo);

    }

}

