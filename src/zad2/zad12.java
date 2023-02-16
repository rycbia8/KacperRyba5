package zad2;
import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nośnik (powietrze, woda, stal): ");
        String nosnik = scanner.nextLine();

        System.out.println("Podaj odległość (w metrach): ");
        double odleglosc = scanner.nextDouble();

        double czas = 0;

        switch (nosnik) {
            case "powietrze":
                czas = odleglosc / 343;
                break;
            case "woda":
                czas = odleglosc / 1490;
                break;
            case "stal":
                czas = odleglosc / 5100;
                break;
            default:
                System.out.println("Nieznany nośnik.");
                System.exit(0);
        }

        System.out.println("Czas potrzebny na pokonanie odległości w " + nosnik + " wynosi " + czas + " s.");
    }
}

