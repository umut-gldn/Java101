import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Sıcaklık değeri girin: ");
        int sicaklik=sc.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapaabilirsiniz.");
        }
        else if(sicaklik>=5 && sicaklik<15)
        {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if(sicaklik>=25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        sc.close();
    }

}
