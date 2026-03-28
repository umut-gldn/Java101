package donguler;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci serisi görmek istersiniz: ");
        int input = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < input; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
