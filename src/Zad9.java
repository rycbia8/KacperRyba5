import java.util.Scanner;
public class Zad9{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String name;
        int age;
        double annualPlay;

        System.out.print("Podaj Nazwisko: ");
        name = klawisz.nextLine();
        System.out.print("Podaj Wiek: ");
        age = klawisz.nextInt();
        System.out.print("Podaj Oczekiwany Roczny dochód: ");
        annualPlay = klawisz.nextInt();


        System.out.print("\nNazywam się " +name);
        System.out.print(", mam " +age);
        System.out.print(" lat i chcę zarabiać " +annualPlay);
        System.out.print(" złotych rocznie.");
    }

}

