package zad2;
import java.util.Scanner;

public class zad13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wybierz pakiet (A, B lub C): ");
        String pakiet = input.nextLine();

        System.out.print("Liczba minut rozmów: ");
        int minuty = input.nextInt();

        double cena;

        if (pakiet.equals("A")) {
            cena = 39.99 + Math.max(0, minuty - 450) * 0.45;
        } else if (pakiet.equals("B")) {
            cena = 59.99 + Math.max(0, minuty - 900) * 0.4;
        } else if (pakiet.equals("C")) {
            cena = 69.99;
        } else {
            System.out.println("Niepoprawny wybór pakietu.");
            return;
        }

        System.out.printf("Miesięczny rachunek: %.2f złotego\n", cena);
    }
}
