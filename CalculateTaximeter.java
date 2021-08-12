import java.util.Scanner;

public class CalculateTaximeter {

    public static void main(String[] args) {
        int km;
        double perKm;
        double price;
        int LeastPrice = 20 ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the distance in km");
        km =input.nextInt();
        perKm = (km /100);
        price = 10 +(perKm * (2.20));
        boolean condition = price <=20;
        System.out.println("Price is:" +(condition ==true ? LeastPrice: price ));

    }
}
