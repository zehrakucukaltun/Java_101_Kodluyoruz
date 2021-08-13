import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int x1 ,x2 , operator;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first number:");
        x1 =input.nextInt();
        System.out.println("Enter the second number:");
        x2 =input.nextInt();
        System.out.println("Choose the operation:\n" +"1-addition\n2-subtraction\n3-multiplication\n4-division");
        operator =input.nextInt();
        switch (operator){
            case 1:
                System.out.println(x1 +x2);
                break;
            case 2:
                System.out.println(x1-x2);
                break;
            case 3:
                System.out.println(x1*x2);
                break;
            case 4:
                System.out.println(x1/x2);
                break;

            default:
                System.out.println("Please enter the numbers correctly!");

        }

    }
}
