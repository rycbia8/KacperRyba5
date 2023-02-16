import java.util.Scanner;
public class ZadZ2Pliku4{

    public static void main(String[] args) {
        System.out.println("Podaj liczbę z zakresu od 1 do 10: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj wynik pierwszego testu: ");
        int wynik1 = scan.nextInt();

        System.out.print("Podaj wynik drugiego testu: ");
        int wynik2 = scan.nextInt();

        System.out.print("Podaj wynik trzeciego testu: ");
        int wynik3 = scan.nextInt();

        int srednia = (wynik1 + wynik2 + wynik3)/3;
        System.out.println("Twoja średnia wyników testów wynosi: " + srednia);

        if (srednia >= 90 && srednia <= 100) {
            System.out.println("Twoja ocena to 5.");
        } else if (srednia >= 80 && srednia <= 89) {
            System.out.println("Twoja ocena to 4.");
        } else if (srednia >= 70 && srednia <= 79) {
            System.out.println("Twoja ocena to 3.");
        } else if (srednia >= 60 && srednia <= 69) {
            System.out.println("Twoja ocena to 2.");
        } else {
            System.out.println("Twoja ocena to 1.");
        }
    }

}
