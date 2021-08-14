import java.util.Scanner;

public class CalculateAvg {
    // Write a program that calculate the average of lessons and determine either pass or not ..
    public static void main(String[] args) {
        double maths , physics , turkish ,chemistry , music , totalaverage , lesson_number =5 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter math point:");
        maths =input.nextDouble();
        System.out.println("Please enter physics point:");
        physics =input.nextDouble();
        System.out.println("Please enter turkish point:");
        turkish =input.nextDouble();
        System.out.println("Please enter chemistry point:");
        chemistry =input.nextDouble();
        System.out.println("Please enter music point:");
        music =input.nextDouble();

        if (!(maths>0 && maths<=100)){
            maths = 0 ;
            lesson_number --;
        }
        if (!(physics>0 && physics<=100)){
            physics =0;
            lesson_number --;
        }
        if (!(turkish>0 && turkish<=100)){
            turkish =0;
            lesson_number --;
        }
        if (!(chemistry>0 && chemistry<=100)){
            chemistry =0;
            lesson_number --;
        }
        if (!(music>0 && music<=100)){
            music =0;
            lesson_number --;
        }

        totalaverage = (maths + physics + turkish + chemistry + music ) /lesson_number;
        if (totalaverage >= 55 && totalaverage<=100){
            System.out.println("You passed and total average is:" + totalaverage);
        }
        else if (totalaverage < 55 && totalaverage >=0){
            System.out.println("You failed and total average is :" +totalaverage);

        }
    }

}
