package mayin_tarlasi_oyunu;

import java.util.Scanner;

public class MineSweeper {
    static Scanner sc = new Scanner(System.in);
    String[][] mayinHaritasi;
    String[][] oyuncuHaritasi;
    int satir;
    int sutun;
    int mayinSayisi;
    int acilmisHücre;

    public MineSweeper() {
        boyutAl();
        mayinHaritasi = new String[satir][sutun];
        oyuncuHaritasi = new String[satir][sutun];
        mayinSayisi = (satir * sutun) / 4;
        acilmisHücre = 0;
        haritayiDoldur();
        mayinYerlestir();
    }

    public void boyutAl() {
        do {
            System.out.print("Satır sayısını giriniz(min 2): ");
            satir = sc.nextInt();
            System.out.print("Sütun sayısını giriniz(min 2): ");
            sutun = sc.nextInt();

            if (satir < 2 || sutun < 2) {
                System.out.println("Minimum 2x2 boyutunda matris giriniz!");
            }

        } while (satir < 2 || sutun < 2);
    }

    public void haritayiDoldur() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                mayinHaritasi[i][j] = "-";
                oyuncuHaritasi[i][j] = "-";
            }
        }
    }

    public void mayinYerlestir() {
        int yerlestirilen = 0;
        while (yerlestirilen < mayinSayisi) {
            int r = (int) (Math.random() * satir);
            int c = (int) (Math.random() * sutun);
            if (!mayinHaritasi[r][c].equals("*")) {
                mayinHaritasi[r][c] = "*";
                yerlestirilen++;
            }
        }
    }

    public void haritayiYazdir(String[][] harita) {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int komsuMayinSay(int r, int c) {
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < satir && j >= 0 && j < sutun) {
                    if (mayinHaritasi[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int[] koordinatAl() {
        int r, c;
        while (true) {
            System.out.print("Satır Giriniz: ");
            r = sc.nextInt();
            System.out.print("Sütun Giriniz: ");
            c = sc.nextInt();

            if (r < 0 || r >= satir || c < 0 || c >= sutun) {
                System.out.println("Geçersiz koordinat.Tekrar giriniz");
            } else if (!oyuncuHaritasi[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi. Başka koordinat giriniz.");
            } else {
                break;
            }
        }
        return new int[] { r, c };
    }

    public boolean kazandiMi() {
        return acilmisHücre == (satir * sutun) - mayinSayisi;
    }

    public void oyunuBaslat() {
        // debug için ilk başta mayınları yerleştiği yerleri inceledim
        // System.out.println("Mayınların Konumu:");
        // haritayiYazdir(mayinHaritasi);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        while (true) {
            haritayiYazdir(oyuncuHaritasi);

            int[] koordinat = koordinatAl();
            int r = koordinat[0];
            int c = koordinat[1];

            if (mayinHaritasi[r][c].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                haritayiYazdir(mayinHaritasi);
                break;
            }
            int komsuMayin = komsuMayinSay(r, c);
            oyuncuHaritasi[r][c] = String.valueOf(komsuMayin);
            acilmisHücre++;

            System.out.println("===========================");

            if (kazandiMi()) {
                System.out.println("Oyunu Kazandınız!");
                haritayiYazdir(oyuncuHaritasi);
                break;
            }
        }
    }

}
