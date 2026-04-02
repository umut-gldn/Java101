import java.util.Scanner;

public class PalindromKelime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = sc.nextLine().toLowerCase();

        System.out.println("Two Pointer : " + twoPointer(kelime));
        System.out.println("Reverse     : " + reverse(kelime));
        System.out.println("StringBuilder: " + stringBuilder(kelime));

        sc.close();
    }

    public static boolean twoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static boolean stringBuilder(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

}
