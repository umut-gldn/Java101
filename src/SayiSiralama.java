import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.sayı: ");
        a = sc.nextInt();

        System.out.print("2.sayı: ");
        b = sc.nextInt();

        System.out.print("3.sayı: ");
        c = sc.nextInt();

        if(a>=b && a>=c){
            if(b>=c){
                System.out.println("a >= b >= c");
            }else{
                System.out.println("a >= c >= b");
            }
        }else if(b>=a && b>=c){
            if(a>=c){
                System.out.println("b >= a >= c");
            }
            else{
                System.out.println("b >= c >= a");
            }
        }else{
            if(b>=a){
                System.out.println("c >= b >= a");
            }
            else{
                System.out.println("c >= a >= b");
            }
        }
        sc.close();
    }
}
