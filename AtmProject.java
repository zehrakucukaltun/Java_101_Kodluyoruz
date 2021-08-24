import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String username, password;
        int balance = 2000;
        int right = 3;
        int number;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.println("please enter your username:");
            username = input.nextLine();
            System.out.println("Please enter your password:");
            password = input.nextLine();

            if (username.equals("Zehra") && password.equals("123")) {
                System.out.println("Login is succefsully completed.");
                System.out.println("select the action!\n" +
                        "1- Deposit\n" +
                        "2-Withdrawal\n" +
                        "3-Balance Inquiry\n" +
                        "4-Log Out");
                number =input.nextInt();

                switch (number){
                    case 1:
                        System.out.println("Please enter the price :");
                        int price = input.nextInt();
                        balance +=price;
                        System.out.println("action is completed. New balance is:" +" " +balance);

                        break;
                    case 2:
                        System.out.println("Please enter the price:");
                        price = input.nextInt();
                        if(price>balance){
                            System.out.println("insufficient balance! please enter a valid amount.");
                            price =input.nextInt();
                            while (price<balance){
                                balance -= price;
                                System.out.println("new balance is:" + balance);
                                break;
                            }
                        }else {
                            balance -= price;
                            System.out.println("new balance is:" + " " +balance);
                        }
                        break;
                    case 3:
                        System.out.println("Current balance is:" + " " +balance);

                        break;
                    case 4:
                        System.out.println("Existing...");
                        break;
                    default:
                        System.out.println("Please select a valid transaction!!");
                   }
                   break;
                 }else{
                    right--;
                    System.out.println("Username or password is wrong. Try again.");
                    if (right ==0){
                        System.out.println("Your account has been blocked. Contact the bank!!");
                    }else {
                        System.out.println("remaining right:" +" "+right);
                    }
            }
        }
    }
}

