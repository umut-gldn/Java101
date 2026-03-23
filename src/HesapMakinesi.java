import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double n1, n2;
        int ops;
        
        System.out.print("Birinci sayıyı giriniz: ");
        n1=sc.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2=sc.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        ops=sc.nextInt();

         switch(ops){
            case 1:
                System.out.println("Toplamı: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu: "+(n1-n2));    
                break;
            case 3:
                System.out.println("Çarpımı: "+(n1*n2));    
                break;
            case 4:
                if(n2==0){
                    System.out.println("0'a bölünmez");
                    break;
                }
                System.out.printf("Bölümü: %.2f\n",(n1/n2));
                break;

            default:
                System.out.println("1,2,3,4 değerlerinden birini giriniz.");
            }
    
        sc.close();
    }
    
}