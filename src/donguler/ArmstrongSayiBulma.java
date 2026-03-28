package donguler;

import java.util.Scanner;

public class ArmstrongSayiBulma {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number =sc.nextInt();

        if(isArmstrong(number)){
            System.out.println(number+" bir Armstrong sayıdır ");
        }else{
            System.out.println(number+" bir Armstrong sayı değildir ");
        }

        System.out.println("--------------------");
        System.out.println("1000'e kadar olan Armstrong sayıları: ");

        for(int i=1;i<=1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int number){
        int original=number;
        int digits=String.valueOf(number).length();
        int sum=0;


        while(number>0){
            int lastDigit=number%10;
            sum +=(int)Math.pow(lastDigit, digits);
            number/=10;
        }
        return sum==original;
    }
}
