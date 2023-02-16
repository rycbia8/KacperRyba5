package zad2;
import java.util.Arrays;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pobieranie trzech imion od użytkownika
        System.out.println("Podaj trzy imiona:");
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();
        }

        // sortowanie imion i wyświetlanie ich w kolejności rosnącej
        Arrays.sort(names);
        System.out.println("Imiona w kolejności rosnącej:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
