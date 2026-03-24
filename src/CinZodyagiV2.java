import java.util.Scanner;

public class CinZodyagiV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum yılını giriniz ");
        int yıl=sc.nextInt();
        
        if(yıl<=0){
            System.out.println("Hatalı yıl girdiniz" );
        }
        else{
            String[] burclar= {"Maymun", "Horoz", "Köpek", "Domuz","Fare", "Öküz", "Kaplan", "Tavşan","Ejderha", "Yılan", "At", "Koyun"};

            int index=yıl%12;
            System.out.println("Çin Zodyağı Burcunuz: "+burclar[index]);
        }
        sc.close();
    }
}
