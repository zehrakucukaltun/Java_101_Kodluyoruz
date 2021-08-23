import java.util.Scanner;

public class UseStars {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k =1; k<=(2*i) - 1 ; k ++){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = n-1; i >=0  ; i--) {
         // i represent the line number here and it will be 4 line .
            for (int j = (n - i); j > 0 ; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
         }
      }
    }
