import java.util.Scanner;

public class DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        int r;
        double alan,cevre;

        Scanner sc=new Scanner(System.in);

        System.out.print("Daire yarıçapı girin: ");
        r=sc.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        int angle=sc.nextInt();
        alan=(Math.PI*(r*r)*angle)/360;
        cevre=Math.PI*r*2;

        System.out.printf("Dairenin alanı: %.2f%n",alan);
        System.out.printf("Dairenin cevresi: %.2f",cevre);

        sc.close();
    }
    
}
