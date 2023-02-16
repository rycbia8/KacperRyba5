package zad2;
import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę kalorii w produkcie: ");
        double totalCalories = input.nextDouble();
        System.out.print("Podaj liczbę gramów tłuszczu w produkcie: ");
        double fatGrams = input.nextDouble();

        double fatCalories = fatGrams * 9.0;
        double percentFatCalories = (fatCalories / totalCalories) * 100.0;

        if (fatCalories > totalCalories) {
            System.out.println("BŁĄD: Liczba kalorii z tłuszczu jest większa niż łączna liczba kalorii w produkcie.");
        } else {
            System.out.printf("Procent kalorii pochodzących z tłuszczu: %.2f%%\n", percentFatCalories);
            if (percentFatCalories < 30.0) {
                System.out.println("Produkt jest niskotłuszczowy.");
            }
        }
    }
}
