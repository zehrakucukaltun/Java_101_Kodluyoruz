//To calculate VAT amount

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the price:");
        double price =input.nextDouble();
        double VAT= 0.18;
        double VAT2 = 0.08;
        double new_price = (price * VAT) +price;
        double new_price2 = (price * VAT2) +price;
        double VAT_amount = (price * VAT);
        double VAT_amount2 = (price * VAT2);
        boolean condition =price >=0 || price <=1000;
        System.out.println("Price with VAT:"+(condition==true? new_price:new_price2));
        boolean condition2 = VAT == 0.18;
        System.out.println("VAT_amount:"+ (condition2 ==true ? VAT_amount:VAT_amount2));



    }

}
