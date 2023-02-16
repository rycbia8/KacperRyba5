import java.util.Scanner;
public class ZadZ2Pliku{

    public static void main(String[] args) {
        System.out.println("Podaj liczbę z zakresu od 1 do 10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10) {
            String rzym;
            switch (number) {
                case 1:
                    rzym = "I";
                    break;
                case 2:
                    rzym = "II";
                    break;
                case 3:
                    rzym = "III";
                    break;
                case 4:
                    rzym = "IV";
                    break;
                case 5:
                    rzym = "V";
                    break;
                case 6:
                    rzym = "VI";
                    break;
                case 7:
                    rzym = "VII";
                    break;
                case 8:
                    rzym = "VIII";
                    break;
                case 9:
                    rzym = "IX";
                    break;
                case 10:
                    rzym = "X";
                    break;
                default:
                    rzym = "";
                    break;
            }
            System.out.println("Liczba rzymska odpowiadająca podanej liczbie to: " + rzym);
        } else {
            System.out.println("Nieprawidłowa wartość!!");
        }

        }
}