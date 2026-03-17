import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        int a,b;
        double c,alan,cevre,u;
        Scanner sc=new Scanner(System.in);

        System.out.print("Bir kenarı giriniz: ");
        a=sc.nextInt();

        System.out.print("Diğer kenarı giriniz: ");
        b=sc.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs= "+c);
 
        cevre=a+b+c;
        u=cevre/2;
       

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin ALanı= "+alan);
        System.out.println("Üçgenin Çevresi= "+cevre);

        sc.close();
    }
}
