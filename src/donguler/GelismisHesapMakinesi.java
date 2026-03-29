package donguler;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int select;

        do {
            System.out.println("\n=== HESAP MAKİNESİ ===");
            System.out.println("1 - Toplama");
            System.out.println("2 - Çıkarma");
            System.out.println("3 - Çarpma");
            System.out.println("4 - Bölme");
            System.out.println("5 - Üs Alma");
            System.out.println("6 - Faktöriyel");
            System.out.println("7 - Mod Alma");
            System.out.println("8 - Dikdörtgen Alan ve Çevre");
            System.out.println("0 - Çıkış");
            System.out.print("Seçiminiz: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (select != 0);
        sc.close();
    }

    public static void toplama() {
        System.out.print("Kaç sayı toplamak istersiniz: ");
        int n = sc.nextInt();

        double result = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı: ");
            result += sc.nextDouble();
        }
        System.out.println("Sonuç: " + result);
    }

    public static void cikarma() {
        System.out.print("Kaç sayı çıkarmak istersiniz: ");
        int n = sc.nextInt();

        System.out.print("1. sayı:");
        double result = sc.nextDouble();
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayı:");
            result -= sc.nextDouble();
        }
        System.out.println("Sonuç: " + result);
    }

    public static void carpma() {
        System.out.print("Kaç sayı çarpmak istersiniz: ");
        int n = sc.nextInt();
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı: ");
            result *= sc.nextDouble();
        }
        System.out.println("Sonuç: " + result);
    }

    public static void bolme() {
        System.out.print("1.sayı: ");
        double a = sc.nextDouble();
        System.out.print("2.sayı: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Sıfıra bölemezsiniz!!!!");
        } else {
            System.out.println("Sonuç: " + (a / b));
        }
    }

    public static void usAlma() {
        System.out.print("Taban: ");
        double base = sc.nextDouble();
        System.out.print("Üs: ");
        double exp = sc.nextDouble();
        System.out.println("Sonuç: " + Math.pow(base, exp));

    }

    public static void faktoriyel() {

        System.out.print("Faktöriyeli alınacak sayı: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negatif sayının faktoriyeli alınamaz!!");
            return;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    public static void modAlma() {
        System.out.print("1.sayı: ");
        int a = sc.nextInt();
        System.out.print("2.sayı: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Sıfıra bölme hatası");
        } else {
            System.out.println("Sonuç: " + (a % b));
        }
    }

    public static void dikdortgen() {
        System.out.print("Uzun kenar: ");
        double longEdge = sc.nextDouble();

        System.out.print("Kısa kenar: ");
        double shortEdge = sc.nextDouble();

        System.out.println("Alan: " + (longEdge * shortEdge));
        System.out.println("Çevre: " + 2 * (longEdge + shortEdge));
    }

}
