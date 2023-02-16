package zad2;
import java.util.Scanner;

public class zad9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wagę przesyłki (w kg): ");
        double waga = input.nextDouble();

        System.out.print("Podaj odległość przesyłki (w km): ");
        int odleglosc = input.nextInt();

        double koszt = 0;

        if (waga <= 1) {
            koszt = 1.1;
        } else if (waga > 1 && waga <= 3) {
            koszt = 2.2;
        } else if (waga > 3 && waga <= 5) {
            koszt = 3.7;
        } else if (waga > 5) {
            koszt = 3.8;
        }

        int iloscStawek = (int) Math.ceil(odleglosc / 500.0);

        double calkowityKoszt = iloscStawek * koszt;

        System.out.printf("Koszt przesyłki wynosi: %.2f zł", calkowityKoszt);
    }

}
