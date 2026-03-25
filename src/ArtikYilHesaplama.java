import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yıl = sc.nextInt();

        if (yıl % 400 == 0) {
            System.out.println(yıl + " Artık yıldır");
        } else if (yıl % 100 == 0) {
            System.out.println(yıl + " Artık yıl değildir");
        } else if (yıl % 4 == 0) {
            System.out.println(yıl + " Artık yıldır");
        } else {
            System.out.println(yıl + " Artık yıl değildir");
        }
        sc.close();
    }
}
/*
 * TEST CASES (Artık Yıl)
 * 1) Yıl: 2000
 * Artık yıldır
 * (Neden: 400'e bölünüyor)
 * 
 * 2) Yıl: 1900
 * Artık yıl değildir
 * (Neden: 100'e bölünüyor ama 400'e bölünmüyor)
 * 
 * 3) Yıl: 2024
 * Artık yıldır
 * (Neden: 4'e bölünüyor, 100'e bölünmüyor)
 * 
 * 4) Yıl: 2023
 * Artık yıl değildir
 * (Neden: 4'e bölünmüyor)
 */
