import java.util.Scanner;
public class Zad14{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);
        double test1, test2, test3, srednia;
        double sumatestow = 3;

        System.out.print("Podaj % z 1 testu: ");
        test1 = klawisz.nextInt();
        System.out.print("Podaj % z 2 testu: ");
        test2 = klawisz.nextInt();
        System.out.print("Podaj % z 3 testu: ");
        test3 = klawisz.nextInt();

        srednia = (test1+test2+test3)/sumatestow;

        System.out.print("\nWynik z testu 1: " +test1);
        System.out.print("\nWynik z testu 2: " +test2);
        System.out.print("\nWynik z testu 3: " +test3);
        System.out.print("\nŚredni wynik na test: " +srednia);



    }

}

