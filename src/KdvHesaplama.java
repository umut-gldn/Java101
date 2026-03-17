import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double price,kdvRate,priceWithKdv;
        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen para değeri girin: ");
        price=sc.nextDouble();

        kdvRate= (price>0 || price<=1000) ? 0.18 : 0.08;
        System.out.println("KDV'siz Fiyat = "+price);
        priceWithKdv=(price*kdvRate)+price;
        System.out.println("KDV'li Fiyat= "+priceWithKdv);
        System.out.println("KDV tutarı = "+kdvRate);

        sc.close();
    }
}
