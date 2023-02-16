package zad2;
import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile książek zakupiłeś w tym miesiącu? ");
        int booksPurchased = scanner.nextInt();

        int pointsEarned = 0;
        if (booksPurchased == 1) {
            pointsEarned = 5;
        } else if (booksPurchased == 2) {
            pointsEarned = 15;
        } else if (booksPurchased == 3) {
            pointsEarned = 30;
        } else if (booksPurchased >= 4) {
            pointsEarned = 60;
        }

        System.out.println("Liczba punktów przyznanych w tym miesiącu: " + pointsEarned);
    }
}
