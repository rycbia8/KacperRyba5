package zad2;
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wybierz pakiet (A, B lub C): ");
        String pakiet = input.nextLine();

        System.out.print("Liczba minut rozmów: ");
        int minuty = input.nextInt();

        double cenaA = 39.99 + Math.max(0, minuty - 450) * 0.45;
        double cenaB = 59.99 + Math.max(0, minuty - 900) * 0.4;
        double cenaC = 69.99;

        System.out.printf("Cena pakietu A: %.2f złotego\n", cenaA);
        System.out.printf("Cena pakietu B: %.2f złotego\n", cenaB);
        System.out.printf("Cena pakietu C: %.2f złotego\n", cenaC);

        if (pakiet.equals("A")) {
            double oszczednosciB = cenaA - cenaB;
            double oszczednosciC = cenaA - cenaC;
            if (oszczednosciB > 0) {
                System.out.printf("Klient korzystający z pakietu A zaoszczędziłby %.2f złotego, wybierając pakiet B\n", oszczednosciB);
            }
            if (oszczednosciC > 0) {
                System.out.printf("Klient korzystający z pakietu A zaoszczędziłby %.2f złotego, wybierając pakiet C\n", oszczednosciC);
            }
        } else if (pakiet.equals("B")) {
            double oszczednosciC = cenaB - cenaC;
            if (oszczednosciC > 0) {
                System.out.printf("Klient korzystający z pakietu B zaoszczędziłby %.2f złotego, wybierając pakiet C\n", oszczednosciC);
            }
        } else if (!pakiet.equals("C")) {
            System.out.println("Niepoprawny wybór pakietu.");
            return;
        }
    }
}

