package zad2;
import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prośba o podanie liczby zakupionych pakietów
        System.out.print("Podaj liczbę zakupionych pakietów: ");
        int liczbaPakietow = input.nextInt();

        double cenaDetaliczna = 99.0; // cena detaliczna jednego pakietu
        double cenaZakupu = cenaDetaliczna * liczbaPakietow; // cena przed rabatem
        double rabat = 0.0; // wartość rabatu w złotych
        double cenaPoRabacie = cenaZakupu; // cena po zastosowaniu rabatu

        // sprawdzenie, czy należy przyznać rabat i jaki jest jego poziom
        if (liczbaPakietow >= 10 && liczbaPakietow < 20) {
            rabat = cenaZakupu * 0.2;
            cenaPoRabacie = cenaZakupu - rabat;
            System.out.println("Przyznano rabat 20%.");
        } else if (liczbaPakietow >= 20 && liczbaPakietow < 50) {
            rabat = cenaZakupu * 0.3;
            cenaPoRabacie = cenaZakupu - rabat;
            System.out.println("Przyznano rabat 30%.");
        } else if (liczbaPakietow >= 50 && liczbaPakietow < 100) {
            rabat = cenaZakupu * 0.4;
            cenaPoRabacie = cenaZakupu - rabat;
            System.out.println("Przyznano rabat 40%.");
        } else if (liczbaPakietow >= 100) {
            rabat = cenaZakupu * 0.5;
            cenaPoRabacie = cenaZakupu - rabat;
            System.out.println("Przyznano rabat 50%.");
        } else {
            System.out.println("Nie przyznano rabatu.");
        }

        // wyświetlenie łącznej kwoty zakupu po rabacie
        System.out.printf("Cena przed rabatem: %.2f zł%n", cenaZakupu);
        System.out.printf("Wartość rabatu: %.2f zł%n", rabat);
        System.out.printf("Cena po rabacie: %.2f zł%n", cenaPoRabacie);
    }
}

