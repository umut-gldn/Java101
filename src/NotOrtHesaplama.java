import java.util.Scanner;

public class NotOrtHesaplama {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int toplam=0,sayac=0;
        double ortalama;

        System.out.print("Matematik notunu giriniz:");
        mat=sc.nextInt();
        if(mat>=0 && mat<=100){
            toplam+=mat;
            sayac++;
        }
        System.out.print("Fizik notunu giriniz:");
        fizik=sc.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            sayac++;
        }
        System.out.print("Türkçe notunu giriniz:");
        turkce=sc.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
            sayac++;
        }
        System.out.print("Kimya notunu giriniz:");
        kimya=sc.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            sayac++;
        }
        System.out.print("Müzik notunu giriniz:");
        muzik=sc.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam+=muzik;
            sayac++;
        }

        if(sayac==0){
            System.out.println("Geçerli değer girmediniz.");
        }
        else{
            //casti bölmeden önce yapmazsam int bölmesi yapıyor onda da yanlış sonuçlar çıkıyor. alt üst yuvarlamadan dolayı
            ortalama=(double)toplam/sayac;
            System.out.println("Ortalamanız: "+ortalama);
            if(ortalama>=55){
                System.out.println("Geçtiniz");
            }
            else{
                System.out.println("Kaldınız");
            }
        }
        sc.close();
    }
    
}
