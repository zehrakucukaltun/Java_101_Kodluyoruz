import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n , k;
        System.out.println("Please enter the number:");
        n = input.nextInt();
        System.out.println("Please enter the power:");
        k = input.nextInt();
        int total =1;

        // with while loop..
        /*
        int i =1;
        while (i<=k){
            total *=n;
            i++;
        }
        System.out.println("n power x equal:" +total);

        */
        // with for loop..

        for(int i =1; i<=k; i ++){
            total *=n;
        }
        System.out.println("n power k is:" + total);
    }
}
