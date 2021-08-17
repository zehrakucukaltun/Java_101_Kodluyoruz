import java.util.Scanner;

public class MeanOfNumbers {
    public static void main(String[] args) {
       //Write a program that calculates the mean of numbers divisible by 3 and 4 which start from 0 to the number entered with loops.
        int num , sum =0 , count =0;
        double avg = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the num value:");
        num = input.nextInt();
        for (int i=0 ; i <=num; i ++){
            if (i %3 ==0 && i%4 ==0){
                sum +=i;
                count ++;
            }
        }
        avg = sum/count;
        System.out.println("sum:"+ sum);

        System.out.println("average:" + avg);
        
    }
}
