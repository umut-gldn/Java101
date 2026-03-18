import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double eachKm=2.20,result;

        Scanner sc= new Scanner(System.in);
        System.out.print("Km olarak mesafe girin: ");
        km=sc.nextInt();

        result=(km*eachKm)+10;
        result=result<20 ? 20 : result;
        System.out.println("Toplam Tutar: "+result);
        sc.close();
    }
}
