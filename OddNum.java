import java.util.Scanner;

public class OddNum {
    /* Write a program that accepts input from the user until a single number is entered with Java loops
     and adds even and multiples of 4 from the entered values and prints it on the screen.
     */

    public static void main(String[] args) {
        int n;
        int total =0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            n = input.nextInt();
            if (n %2 ==1){
                break;
            }
            else if (n%2 ==0 && n%4 ==0) {
                total += n;
            }
        }while (n>0);
        System.out.println("Total:" + total);

    }
}
