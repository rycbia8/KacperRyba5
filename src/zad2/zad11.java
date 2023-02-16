package zad2;
import java.util.Scanner;

public class zad11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nazwiska = new String[3];
        int[] czasy = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Podaj nazwisko " + (i+1) + ". biegacza: ");
            nazwiska[i] = scanner.nextLine();
            System.out.print("Podaj czas ukończenia biegu (w minutach): ");
            czasy[i] = scanner.nextInt();
            scanner.nextLine(); // pobierz znak nowej linii
        }

        System.out.println("Wyniki biegu:");
        int miejsce = 1;
        for (int i = 0; i < 3; i++) {
            int najszybszyCzas = Integer.MAX_VALUE;
            int najszybszyBiegacz = -1;
            for (int j = 0; j < 3; j++) {
                if (czasy[j] < najszybszyCzas) {
                    najszybszyCzas = czasy[j];
                    najszybszyBiegacz = j;
                }
            }
            System.out.println(miejsce + ". miejsce: " + nazwiska[najszybszyBiegacz] + ", czas: " + czasy[najszybszyBiegacz] + " minut");
            czasy[najszybszyBiegacz] = Integer.MAX_VALUE;
            miejsce++;
        }
    }
}
