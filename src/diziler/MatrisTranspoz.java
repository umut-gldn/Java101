package diziler;

import java.util.Scanner;

public class MatrisTranspoz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matris = diziOlustur();
        int[][] transpoz = transpozAl(matris);

        System.out.println("Matris:");
        yazdir(matris);

        System.out.println("Transpoz:");
        yazdir(transpoz);

        sc.close();

    }

    public static int[][] diziOlustur() {
        System.out.print("Satır sayısı: ");
        int satir = sc.nextInt();
        System.out.print("Sütun sayısı: ");
        int sutun = sc.nextInt();

        int[][] matris = new int[satir][sutun];

        System.out.println("Matris elemanlarını giriniz: ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matris[i][j] = sc.nextInt();
            }
        }
        return matris;
    }

    public static int[][] transpozAl(int[][] matris) {
        int satir = matris.length;
        int sutun = matris[0].length;
        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        return transpoz;
    }

    public static void yazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                // sayıları sola hizalayarak 5 karakter boşluklu diziyor
                System.out.printf("%-5d", matris[i][j]);
            }
            System.out.println();
        }
    }
}
