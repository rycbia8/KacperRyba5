public class Zad18{

    public static void main(String[] args) {


        double Akcje = 600;
        double Cena = 21.77;
        double prowizja = 0.02;


        double KwotaZaAkcje, WysProwizji, Laczna;
        KwotaZaAkcje = Akcje * Cena;
        WysProwizji = KwotaZaAkcje * prowizja;
        Laczna = KwotaZaAkcje + WysProwizji;

        System.out.print("\n\nKwota zapłacona za same akcje: " +KwotaZaAkcje);
        System.out.print("\nWysokość prowizji " +WysProwizji);
        System.out.print("\nLączna zapłacona kwota " +Laczna);



    }

}

