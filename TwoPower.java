import java.util.Scanner;

public class TwoPower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
        /*
        for (int i = 1 ; i<=n; i*=2){

        int i=1;
        while (i<=n){
            System.out.println("i :" + i );
            i*=2;
            }
*/
        for (int i =1 ; i<=n ; i*=4) {

            System.out.println("Power of 4:" + i);
        }
        for (int j =1; j <=n ; j*=5){
            System.out.println("power  of 5:" + j);
        }
}
}