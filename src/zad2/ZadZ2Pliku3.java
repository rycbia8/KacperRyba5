import java.util.Scanner;
public class ZadZ2Pliku3{

    public static void main(String[] args) {
        System.out.println("Proszę podać liczbę z zakresu od 1 do 10: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj swoją wagę w kilogramach: ");
        double waga = scan.nextDouble();

        System.out.print("Podaj swój wzrost w metrach: ");
        double wzrost = scan.nextDouble();

        double bmi = waga/(wzrost*wzrost);
        System.out.println("Twój wskaźnik BMI wynosi: " + bmi);

        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Twoja waga jest Optymalna!");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę!");
        } else {
            System.out.println("Masz nadwagę!");
        }
    }

}
