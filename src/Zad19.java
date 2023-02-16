public class Zad19{

    public static void main(String[] args) {


        double Konsumenci = 12467;
        double JedenEnerg = 0.14;
        double Cytrusowy = 0.64;


        double IloscCoTyg, IloscCytrus,  IloscCytrustyg;
        IloscCoTyg = Konsumenci * JedenEnerg;
        IloscCytrus = Konsumenci * Cytrusowy;
        IloscCytrustyg = IloscCoTyg * Cytrusowy;

        System.out.printf("\n\n Ilość ankietowanych którzy piją raz na tydzień: %.0f", IloscCoTyg);
        System.out.printf("\n Ilośc preferujących cytrusowe (z tych co piją raz na tyg): %.0f", IloscCytrustyg);
        System.out.printf("\n Łącznie klientów: %.0f", Konsumenci);
        System.out.printf("\n Ilośc preferujących cytrusowe (ogólnie): %.0f", IloscCytrus);



    }

}

