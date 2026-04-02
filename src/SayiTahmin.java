import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gizliSayi = (int) (Math.random() * 101);

        int tahmin = 0;
        int hak = 5;

        System.out.println("0-100 arasında bir sayı tuttum. " + hak + " hakkınız var. Tahmin etmeye başlayın!");
        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = sc.nextInt();
            hak--;

            if (tahmin < gizliSayi) {
                System.out.println("Daha büyük bir sayı giriniz.");
            } else if (tahmin > gizliSayi) {
                System.out.println("Daha küçük bir sayı giriniz.");
            } else {
                System.out.println("Tebrikler! " + (5 - hak) + " denemede Doğru tahmin ettiniz.");
                break;
            }

            if (hak == 0) {
                System.out.println("Hakkınız kalmadı. Gizli sayı: " + gizliSayi);
            } else {
                System.out.println("Kalan hakkınız: " + hak);
            }
        } while (hak > 0 && tahmin != gizliSayi);
        
        sc.close();
    }

}
