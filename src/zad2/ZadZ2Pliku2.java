import java.util.Scanner;
public class ZadZ2Pliku2{

    public static void main(String[] args) {
        System.out.println("Podaj liczbę z zakresu od 1 do 10: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj dzień: ");
        int dzien = scan.nextInt();

        System.out.print("Podaj miesiąc (w formie liczby): ");
        int miesiac = scan.nextInt();

        System.out.print("Podaj dwa ostatnie cyfry roku: ");
        int rok = scan.nextInt();

        int Iloczyn = dzien * miesiac;

        if (Iloczyn == rok) {
            System.out.println("Data jest magiczna!");
        } else {
            System.out.println("Data nie jest magiczna.");
        }
    }

}
