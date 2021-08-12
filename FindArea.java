// Area of triangle

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = input.nextInt();
        System.out.println("Enter the value b:");
        int b = input.nextInt();
        System.out.println("Enter value c:");
        int c =input.nextInt();
        double u = (a + b + c)/2 ;
        double area = Math.sqrt(u * (u-a)* (u-b)* (u-c));
        System.out.println("Area of triangle is:" + area);




    }
}
