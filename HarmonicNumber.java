import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.println("Please enter the number:");
        num = input.nextInt();
        double total =0.0;
        for (double i =1; i<=num ; i++){
            total +=(1/i);

        }
        System.out.println("The result is: " + total);
    }
}
