import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, r;
        int fact_n = 1, fact_r = 1, fact_sub = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number n:");
        n = input.nextInt();
        System.out.println("Please enter number r:");
        r = input.nextInt();

        for (int i = 2; i <= n; i++) {
            fact_n *= i;
        }
        for (int i = 1; i <= r; i++) {
            fact_r *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            fact_sub *= i;
        }
        if (n > r) {
            double comb = fact_n / ((fact_r) * fact_sub);
            System.out.println("fact n :" + fact_n);
            System.out.println("fact r :" + fact_r);
            System.out.println("substract n-r:" + fact_sub);
            System.out.println("Combination is C(n,r):"+comb);

        } else {
            System.out.println("n must bigger than r:");
        }

    }
}
