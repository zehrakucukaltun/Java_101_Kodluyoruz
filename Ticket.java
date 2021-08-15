import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        int age , type ;
        double distance , price ,discount = 0, dis_price;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance (in KM):");
        distance =input.nextDouble();
        System.out.println("Enter your age:");
        age =input.nextInt();
        System.out.println("Choose passage type:\n1-one way\n2-round-trip:");
        type =input.nextInt();

        price = distance * 0.10;

        if (distance>=0 && age>=0 && type>0 && type<=2){
            if (age<12){
                discount =price*0.50;
            } else if (age>=12 && age<=24){
                discount=price*0.10;
            }if (age>=65){
                discount =price*0.30;
            }

        } else {
            System.out.println("bad data entry!");
        }
        dis_price = price - discount;

        switch (type) {
            case 1:
                System.out.println("Total price is: "+price + " Turkish lira");
                break;
            case 2:
                price = 2*(dis_price - (dis_price * 0.20));
                System.out.println("Total price is:" + price + " Turkish Lira");
                break;

            default:
                System.out.println("Bad data entry!");
                break;
        }

    }
}
