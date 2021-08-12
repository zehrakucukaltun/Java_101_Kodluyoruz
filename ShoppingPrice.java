import java.util.Scanner;

public class ShoppingPrice {

    public static void main(String[] args) {
     /*
        pear = 2.14 KG
        Apple = 3,67 KG
        tomato =1.11 KG
        banana = 0,95 KG
        aubergine = 5.00 KG
      */
        Scanner input = new Scanner(System.in);
        System.out.println("how many kilograms of pear:");
        double p = input.nextDouble();
        System.out.println("how many kilograms of apple:");
        double ap =input.nextDouble();
        System.out.println("how many kilograms of tomato:");
        double t =input.nextDouble();
        System.out.println("how many kilograms of banana:");
        double b =input.nextDouble();
        System.out.println("how many kilograms of aubergine:");
        double au =input.nextDouble();

        double total_price = (p * 2.14) + (ap * 3.67) +(t * 1.11) +(b* 0.95) +(au * 5.00);
        System.out.print("total price is:" +total_price);

    }
}
