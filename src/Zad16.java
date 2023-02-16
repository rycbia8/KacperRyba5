import java.util.Scanner;
public class Zad16{

    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);



        System.out.print("Podaj nazwę swojego ulubionego miasta: ");
        String Miasto = klawisz.nextLine();


        System.out.print("\nTwoje Ulubione miasto to: " +Miasto);
        System.out.print("Ilość znaków: ");
        System.out.println(Miasto.length());
        System.out.print("Dużymi literami: ");
        System.out.println(Miasto.toUpperCase());
        System.out.print("Małymi literami: ");
        System.out.println(Miasto.toLowerCase());
        System.out.print("Pierwsza litera: ");
        System.out.print(Miasto.charAt(0));


    }

}

