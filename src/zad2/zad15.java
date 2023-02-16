package zad2;
import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę czeków wystawionych w danym miesiącu: ");
        int liczbaCzekow = scanner.nextInt();

        double dodatkoweOplaty = 0;
        if (liczbaCzekow < 20) {
            dodatkoweOplaty = liczbaCzekow * 0.10;
        } else if (liczbaCzekow >= 20 && liczbaCzekow < 40) {
            dodatkoweOplaty = liczbaCzekow * 0.08;
        } else if (liczbaCzekow >= 40 && liczbaCzekow < 60) {
            dodatkoweOplaty = liczbaCzekow * 0.06;
        } else if (liczbaCzekow >= 60) {
            dodatkoweOplaty = liczbaCzekow * 0.04;
        }

        double laczneOplaty = 10.0 + dodatkoweOplaty;
        System.out.println("Opłaty pobrane przez bank w danym miesiącu: " + laczneOplaty + " zł");
    }
}
