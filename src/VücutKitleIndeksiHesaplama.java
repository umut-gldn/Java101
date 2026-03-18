import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {
    
    public static void main(String[] args) {
        double weight,height,result;
        Scanner sc=new Scanner(System.in);

        System.out.print("Boyunuzu girin(metre cinsinden): ");
        height=sc.nextDouble();

        System.out.print("Kilonuzu girin: ");
        weight=sc.nextDouble();

        result=weight/(height*height);
        System.out.printf("Vücut Kitle Endeksin: %.2f ",result);
    }
}
