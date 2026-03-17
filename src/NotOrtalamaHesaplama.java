import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ort;

        System.out.print("Matematik notunuzu girin: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        kimya = sc.nextInt();

        System.out.print("Türkçe notunuzu girin: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        tarih = sc.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        muzik = sc.nextInt();

        ort=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız: "+ort);

        //String result=ort >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(ort >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}