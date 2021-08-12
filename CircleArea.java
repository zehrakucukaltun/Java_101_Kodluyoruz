import java.util.Scanner;

public class CircleArea {
    /* Write a program that finds the area of a circle
    with radius r and measure 𝛼 of its central angle. */

    public static void main(String[] args) {
        double pi , r ,a;
        pi = 3.14;
        Scanner input =new Scanner(System.in);
        System.out.println("Radius:");
        r = input.nextDouble();
        System.out.println("measure of central angle:");
        a = input.nextDouble();
        double AreaFormula = (pi * (r*r)*a) /360;
        System.out.println("Area of a circle :" + AreaFormula);
    }
}
