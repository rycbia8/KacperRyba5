package zad2;
import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wegetarianska = false;
        boolean weganska = false;
        boolean bezglutenowa = false;

        // Pytania o diety
        System.out.print("Czy któraś z osób jest na diecie wegetariańskiej? ");
        String wegetarianskaOdp = scanner.nextLine();
        if (wegetarianskaOdp.equalsIgnoreCase("tak")) {
            wegetarianska = true;
        }

        System.out.print("Czy któraś z osób jest na diecie wegańskiej? ");
        String weganskaOdp = scanner.nextLine();
        if (weganskaOdp.equalsIgnoreCase("tak")) {
            weganska = true;
        }

        System.out.print("Czy któraś z osób jest na diecie bezglutenowej? ");
        String bezglutenowaOdp = scanner.nextLine();
        if (bezglutenowaOdp.equalsIgnoreCase("tak")) {
            bezglutenowa = true;
        }

        // Wybór restauracji
        System.out.println("Możecie wybrać się do następujących restauracji:");

        if (wegetarianska && weganska && bezglutenowa) {
            System.out.println("Kuchnia u Szefa");
            System.out.println("Kawiarnia na Rogu");
        }

        if (wegetarianska && bezglutenowa) {
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        }

        if (wegetarianska) {
            System.out.println("Włoskie Specjały");
            System.out.println("Pizzeria przy Dworcowej");
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        }

        if (!wegetarianska && !bezglutenowa && !weganska) {
            System.out.println("Luksusowe Burgery u Jarka");
        }
    }
}

