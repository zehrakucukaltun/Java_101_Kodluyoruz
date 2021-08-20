import javax.security.sasl.SaslClient;
import java.util.Scanner;


// 407 amrs.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number=input.nextInt();;
  /*

        int digitnumber =0;
        int digitValue;
        int result=0;
        int digPow;
        int tempnumber=number;

        // to find count of digit..
        // example: 407 has 3 digit .
        while(tempnumber!=0){
            tempnumber /=10;
            digitnumber ++;
        }
        System.out.println(digitnumber);
        tempnumber =number;

        // to calculate power of digits and multiply with their digit values..
        while (tempnumber!=0){
            digitValue = tempnumber%10;
            digPow =1;
            for (int i = 1; i<=digitnumber; i++){
                digPow *= digitValue;
            }
            result +=digPow;
            tempnumber /=10;
        }

        if (result == number){
            System.out.println(number + "is an armstrong number.");
        }
        else {
            System.out.println(number + "is not a armstrong number.");
        }

*/
         int sum =0;
        while (number!=0){
            sum =(number%10) + sum;
            number /=10;
            System.out.println(number);
            }
        System.out.println(sum + " is sum of digits of the given number");
        }
    }

