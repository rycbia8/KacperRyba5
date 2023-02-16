import java.util.Scanner;
public class Zad10{

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String firstName, middleName, lastName;
        char firstinitial, midleinitial, lastinitial;

        System.out.print("Podaj Imię: ");
        firstName = klawisz.nextLine();
        System.out.print("Podaj drugie Imie: ");
        middleName = klawisz.nextLine();
        System.out.print("Podaj Nazwisko: ");
        lastName = klawisz.nextLine();


        System.out.print("\n\nPierwsze imię: " +firstName);
        System.out.print("\n Drugie imię: " +middleName);
        System.out.print("\n Nazwisko: " +lastName);

        firstinitial = firstName.charAt(0);
        midleinitial = middleName.charAt(0);
        lastinitial = lastName.charAt(0);

        System.out.print("\n\n Moje iniciały to " +firstinitial +midleinitial +lastinitial);

    }

}

