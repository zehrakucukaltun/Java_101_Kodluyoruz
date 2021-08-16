import java.util.Scanner;

public class ChineseAstrology {
        // Find china zodiac..
    public static void main(String[] args) {
        int year;
        int remainder;
        String zodiac ="";
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter year of birth (example:1990)");
        year = input.nextInt();
        remainder = year %12;

        switch (remainder){
            case 0:
                zodiac ="Monkey";
                break;
            case 1:
                zodiac = "Cock";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac ="Pig";
                break;
            case 4:
                zodiac = "Mouse";
                break;
            case 5:
                zodiac ="Cattle";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            default:
                System.out.println(" invalid number");
        }
        System.out.println("Your Chinese Zodiac Horoscope is:" + zodiac);
    }
}
