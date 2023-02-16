import java.util.Scanner;
public class Zad12{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double kilometry, litry, KnP;

        System.out.print("Ilość przejechanych kilometrów: ");
        kilometry = klawisz.nextInt();

        System.out.print("Ilość zużytych litrów paliwa ");
        litry = klawisz.nextInt();

        KnP = kilometry/litry;

        System.out.print("\nIlość przejechanych kilometrów " +kilometry);
        System.out.print("\nIlośc zużytych litrów: " +litry);
        System.out.print("\n\nKilometry na litrze: " +KnP);


    }

}