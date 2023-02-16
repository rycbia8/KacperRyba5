public class Zad5{

    public static void main(String[] args) {

        int pom1,pom2,pom3,pom4;
        int calkowita, os;
        int dlugoscX, dlugoscY;
        double NaOs;



        dlugoscX=3;
        dlugoscY=4;
        pom1 = dlugoscX*dlugoscY;
        dlugoscX=3;
        dlugoscY=4;
        pom2 = dlugoscX*dlugoscY;
        dlugoscX=2;
        dlugoscY=3;
        pom3 = dlugoscX*dlugoscY;
        dlugoscX=2;
        dlugoscY=2;
        pom4 = dlugoscX*dlugoscY;
        os = 4;
        calkowita = pom1 + pom2 + pom3 + pom4;
        NaOs = (double)calkowita/os;

        System.out.print("\nPomieszczenie 1: " +pom1);
        System.out.print("\nPomieszczenie 2: " +pom2);
        System.out.print("\nPomieszczenie 3: " +pom3);
        System.out.print("\nPomieszczenie 4: " +pom4);
        System.out.print("\nCałkowita powierzchnia: " +calkowita);
        System.out.print("\nIlość miejsca na jedną osobę: " +NaOs);

    }

}

