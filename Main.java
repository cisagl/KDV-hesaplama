import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("KDV HESAPLAMA EKRANI");
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen ödediğiniz tutarı giriniz: ");
        double odenen = inp.nextDouble();

        double kdvOrani = (odenen >= 0 && odenen <= 1000) ? 0.18 : 0.08;
        double kdvTutari = odenen * kdvOrani;
        double topTutar = kdvTutari + odenen;

        System.out.println("KDV Oranı: " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("Ödenecek KDV'li toplam tutar: " + topTutar + " TL");
    }
}