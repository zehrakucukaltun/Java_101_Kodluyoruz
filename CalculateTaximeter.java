import java.util.Scanner;

public class CalculateTaximeter {

    public static void main(String[] args) {
        int km;
        double perKm= 2.20;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the distance in km");
        km =input.nextInt();
        price =(km*perKm);
        price = 10 + price;
        price= (price <20) ? 20: price;
        System.out.println("Price is:" + price );

    }
}
