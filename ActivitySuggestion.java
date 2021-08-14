import java.util.Scanner;
public class ActivitySuggestion {
    //Suggest an activity based on weather..
    /*
    Conditions:
    1- Suggest skiing if temperature smaller than 5.
    2-Suggest the "Cinema" activity if the temperature is between 5 and 15.
    3-Suggest the "Picnic" activity if the temperature is between 10 and 25.
    4-Suggest "swimming" activity if the temperature is bigger than 25.
     */
    public static void main(String[] args) {
        double temp;
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the temperature:");
        temp =input.nextDouble();
        if (temp<5){
            System.out.println("You can ski");
        }
        else if (temp>=10 && temp<=15){
            System.out.println("You can go to cinema or picnic");
        }
        else if (temp>=5 && temp<=15){
            System.out.println("You can go to cinema");
        }
        else if (temp>=10 && temp<=25){
            System.out.println("You can go to picnic");
        }
        else{
            System.out.println("You can go to swimming");
        }
    }
}
