import java.util.Scanner;
public class ZadZ2Pliku5{

    public static void main(String[] args) {
        System.out.println("Podaj liczbę z zakresu od 1 do 10: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj masę obiektu w kilogramach: ");
        double masa = scan.nextDouble();

        double waga = masa * 9.8;
        System.out.println("Ciężar obiektu wynosi: " + waga + " niutonów.");

        if (waga > 1000) {
            System.out.println("Obiekt jest zbyt ciężki.");
        } else if (waga < 10) {
            System.out.println("Obiekt jest za lekki.");
        }
    }

}
