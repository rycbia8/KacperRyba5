package zad2;
import java.util.Scanner;

public class z6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund: ");
        int seconds = scanner.nextInt();

        if (seconds >= 86400) {
            int days = seconds / 86400;
            System.out.println("Liczba dni: " + days);
            seconds = seconds % 86400;
        }

        if (seconds >= 3600) {
            int hours = seconds / 3600;
            System.out.println("Liczba godzin: " + hours);
            seconds = seconds % 3600;
        }

        if (seconds >= 60) {
            int minutes = seconds / 60;
            System.out.println("Liczba minut: " + minutes);
            seconds = seconds % 60;
        }

        if (seconds > 0) {
            System.out.println("Liczba pozostałych sekund: " + seconds);
        }
    }
}