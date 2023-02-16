import java.util.Scanner;
public class Zad8{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int pom1,pom2,pom3,pom4;
        int calkowita, os;
        int dlugoscX, dlugoscY;
        double NaOs;


        System.out.print("Podaj długość pokojju nr1: ");
        dlugoscX = klawisz.nextInt();
        System.out.print("Podaj szerokosc pokojju nr1: ");
        dlugoscY = klawisz.nextInt();
        pom1 = dlugoscX*dlugoscY;
        System.out.print("Podaj długość pokojju nr2: ");
        dlugoscX = klawisz.nextInt();
        System.out.print("Podaj szerokosc pokojju nr2: ");
        dlugoscY = klawisz.nextInt();
        pom2 = dlugoscX*dlugoscY;
        System.out.print("Podaj długość pokojju nr3: ");
        dlugoscX = klawisz.nextInt();
        System.out.print("Podaj szerokosc pokojju nr3: ");
        dlugoscY = klawisz.nextInt();
        pom3 = dlugoscX*dlugoscY;
        System.out.print("Podaj długość pokojju nr4: ");
        dlugoscX = klawisz.nextInt();
        System.out.print("Podaj szerokosc pokojju nr4: ");
        dlugoscY = klawisz.nextInt();
        pom4 = dlugoscX*dlugoscY;
        os = 4;
        calkowita = pom1 + pom2 + pom3 + pom4;
        NaOs = (double)calkowita/os;

        System.out.print("\nPomieszczenie 1: " +pom1);
        System.out.print("\nPomieszczenie 2: " +pom2);
        System.out.print("\nPomieszczenie 3: " +pom3);
        System.out.print("\nPomieszczenie 4: " +pom4);
        System.out.print("\nCałkowita powierzchnia: " +calkowita);
        System.out.print("\nIlość miejsca na jedną osobę: " +NaOs);

    }

}